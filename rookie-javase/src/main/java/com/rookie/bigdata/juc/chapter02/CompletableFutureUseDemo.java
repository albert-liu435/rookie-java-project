package com.rookie.bigdata.juc.chapter02;

import java.util.concurrent.*;

/**
 * @Author rookie
 * @Description
 * @Date 2025/5/11 9:56
 * @Version 1.0
 */
public class CompletableFutureUseDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        future1();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + "---come in");
            int result = ThreadLocalRandom.current().nextInt(10);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (result > 5) { //模拟产生异常情况
                int i = 10 / 0;
            }
            System.out.println("----------1秒钟后出结果" + result);
            return result;
        }, executorService).whenComplete((v, e) -> {
            if (e == null) {
                System.out.println("计算完成 更新系统" + v);
            }
        }).exceptionally(e -> {
            e.printStackTrace();
            System.out.println("异常情况：" + e.getCause() + " " + e.getMessage());
            return null;
        });
        System.out.println(Thread.currentThread().getName() + "先去完成其他任务");
        executorService.shutdown();
    }

    private static void future1() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + "---come in");
            int result = ThreadLocalRandom.current().nextInt(10);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (result > 5) { //模拟产生异常情况
                int i = 10 / 0;
            }
            System.out.println("----------1秒钟后出结果" + result);
            return result;
        }, executorService).whenComplete((v, e) -> {
            if (e == null) {
                System.out.println("计算完成 更新系统" + v);
            }
        }).exceptionally(e -> {
            e.printStackTrace();
            System.out.println("异常情况：" + e.getCause() + " " + e.getMessage());
            return null;
        });
        System.out.println(Thread.currentThread().getName() + "先去完成其他任务");
        executorService.shutdown();
    }
}

/**
 * 无异常情况
 * pool-1-thread-1---come in
 * main先去完成其他任务
 * ----------1秒钟后出结果9
 * 计算完成 更新系统9
 */

/**
 * 有异常情况
 *pool-1-thread-1---come in
 * main先去完成其他任务
 * java.util.concurrent.CompletionException: java.lang.ArithmeticException: / by zero
 * 异常情况：java.lang.ArithmeticException: / by zero java.lang.ArithmeticException: / by zero
 */