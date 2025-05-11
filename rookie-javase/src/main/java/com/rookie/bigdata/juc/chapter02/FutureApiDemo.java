package com.rookie.bigdata.juc.chapter02;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @Author rookie
 * @Description
 * @Date 2025/5/11 9:11
 * @Version 1.0
 */
public class FutureApiDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(()->{
            System.out.println(Thread.currentThread().getName()+"\t ===come in");
            try{
             TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "task over";

        });

        Thread t1=new Thread(futureTask,"t1");
        t1.start();

        System.out.println(Thread.currentThread().getName()+"\t ---忙其他任务了");

        System.out.println(futureTask.get());
    }
}
