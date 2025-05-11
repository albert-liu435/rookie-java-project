package com.rookie.bigdata.juc.chapter04;

import java.util.concurrent.TimeUnit;

/**
 * @Author rookie
 * @Description
 * @Date 2025/5/11 16:59
 * @Version 1.0
 */
public class InterruptDemo {
    static volatile boolean isStop = false; //volatile表示的变量具有可见性

    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                if (isStop) {
                    System.out.println(Thread.currentThread().getName() + " isStop的值被改为true，t1程序停止");
                    break;
                }
                System.out.println("-----------hello volatile");
            }
        }, "t1").start();
        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            isStop = true;
        }, "t2").start();

    }
}
/**
 * -----------hello volatile
 * -----------hello volatile
 * -----------hello volatile
 * -----------hello volatile
 * -----------hello volatile
 * -----------hello volatile
 * t1 isStop的值被改为true，t1程序停止
 */
