package com.rookie.bigdata.juc.chapter04;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @Author rookie
 * @Description
 * @Date 2025/5/11 17:10
 * @Version 1.0
 */
public class InterruptBooleanDemo {
        static AtomicBoolean atomicBoolean = new AtomicBoolean(false);


        public static void main(String[] args) {
            new Thread(() -> {
                while (true) {
                    if (atomicBoolean.get()) {
                        System.out.println(Thread.currentThread().getName() + " atomicBoolean的值被改为true，t1程序停止");
                        break;
                    }
                    System.out.println("-----------hello atomicBoolean");
                }
            }, "t1").start();
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            new Thread(() -> {
                atomicBoolean.set(true);
            }, "t2").start();

        }
    }

/**
 * -----------hello atomicBoolean
 * -----------hello atomicBoolean
 * -----------hello atomicBoolean
 * -----------hello atomicBoolean
 * -----------hello atomicBoolean
 * t1 atomicBoolean的值被改为true，t1程序停止
 */
