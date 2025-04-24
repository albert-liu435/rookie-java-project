package com.rookie.bigdata.util.java_concurrency.test01;

/**
 * @Class ThreadTest
 * @Description
 * @Author rookie
 * @Date 2025/4/15 15:07
 * @Version 1.0
 */
public class ThreadTest {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        });

        thread.start();


        Thread thread1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if(i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }

                }
            }
        };

        thread1.start();
    }


}
