package com.rookie.bigdata.algorithm.slidingwindow;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Class SlidingWindowRateLimiter
 * @Description 滑动窗口算法 https://cloud.tencent.com/developer/article/2469418
 * @Author rookie
 * @Date 2025/5/9 15:23
 * @Version 1.0
 */
public class SlidingWindowRateLimiter {
    private final int limit; // 每窗口最大请求数
    private final long windowSizeInMillis; // 窗口大小（毫秒）
    private final int slotCount; // 窗口划分的区间数
    private final long slotSizeInMillis; // 每个区间大小（毫秒）
    private Queue<Integer> slots; // 滑动窗口的请求数队列
    private long lastRefreshTime; // 上次刷新时间

    public SlidingWindowRateLimiter(int limit, long windowSizeInMillis, int slotCount) {
        this.limit = limit;
        this.windowSizeInMillis = windowSizeInMillis;
        this.slotCount = slotCount;
        this.slotSizeInMillis = windowSizeInMillis / slotCount;
        this.slots = new LinkedList<>();
        for (int i = 0; i < slotCount; i++) {
            slots.add(0);
        }
        this.lastRefreshTime = System.currentTimeMillis();
    }

    public synchronized boolean allowRequest() {
        refreshSlots(); // 更新窗口内的区间计数

        // 累计当前窗口内的请求总数
        int currentWindowRequestCount = slots.stream().mapToInt(Integer::intValue).sum();

        if (currentWindowRequestCount < limit) {
            // 若未超限，则放行并记录请求
            int lastSlot = slots.poll();
            slots.add(lastSlot + 1); // 增加当前区间的请求计数
            return true;
        } else {
            // 请求超过阈值，拒绝请求
            return false;
        }
    }

    // 更新窗口区间的请求计数
    private void refreshSlots() {
        long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime - lastRefreshTime;
        //  判断是否需要更新窗口
        if (elapsedTime >= slotSizeInMillis) {
            int slotsToUpdate = (int) (elapsedTime / slotSizeInMillis);
            for (int i = 0; i < Math.min(slotsToUpdate, slotCount); i++) {
                slots.poll();
                slots.add(0); // 初始化新时间片的请求计数
            }
            lastRefreshTime = currentTime - (elapsedTime % slotSizeInMillis);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SlidingWindowRateLimiter limiter = new SlidingWindowRateLimiter(5, 1000, 10);

        // 测试连续请求
        for (int i = 0; i < 15; i++) {
            System.out.println("请求 " + (i + 1) + ": " + (limiter.allowRequest() ? "通过" : "拒绝"));
            Thread.sleep(100);
        }
    }
}
