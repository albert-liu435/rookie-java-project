package com.rookie.bigdata.juc.chapter02;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author rookie
 * @Description
 * @Date 2025/5/11 8:46
 * @Version 1.0
 */
public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<String> futureTask = new FutureTask<>(new Mythread());
        Thread t1=new Thread(futureTask,"t1");
        t1.start();


        String s = futureTask.get();
        System.out.println("获取异步结果："+s);

    }
}



class Mythread implements Callable<String>{

    @Override
    public String call() throws Exception {

        System.out.println("com int call ");
        return "hello Callable";
    }
}
