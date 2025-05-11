package com.rookie.bigdata.juc.chapter04;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @Author rookie
 * @Description 使用interrupt() 和isInterrupted()组合使用来中断某个线程
 * @Date 2025/5/11 17:11
 * @Version 1.0
 */

public class InterruptStopDemo {
    static AtomicBoolean atomicBoolean = new AtomicBoolean(false);


    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println(Thread.currentThread().getName() + " isInterrupted()的值被改为true，t1程序停止");
                    break;
                }
                System.out.println("-----------hello isInterrupted()");
            }
        }, "t1");
        t1.start();

        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //t2向t1放出协商，将t1中的中断标识位设为true，希望t1停下来
        new Thread(() -> t1.interrupt(), "t2").start();

        //当然，也可以t1自行设置
        t1.interrupt();

    }
}
/**
 * -----------hello isInterrupted()
 * -----------hello isInterrupted()
 * -----------hello isInterrupted()
 * -----------hello isInterrupted()
 * t1 isInterrupted()的值被改为true，t1程序停止
 */
