package com.rookie.bigdata.juc.chapter04;

/**
 * @Author rookie
 * @Description
 * @Date 2025/5/11 20:28
 * @Version 1.0
 */
public class InterruptDemo4 {
    public static void main(String[] args) {
        /**
         * main	false
         * main	false
         * -----------1
         * -----------2
         * main	true
         * main	false
         */
        System.out.println(Thread.currentThread().getName() + "\t" + Thread.interrupted());//false
        System.out.println(Thread.currentThread().getName() + "\t" + Thread.interrupted());//false
        System.out.println("-----------1");
        Thread.currentThread().interrupt();
        System.out.println("-----------2");
        System.out.println(Thread.currentThread().getName() + "\t" + Thread.interrupted());//true
        System.out.println(Thread.currentThread().getName() + "\t" + Thread.interrupted());//false

    }
}