package com.rookie.bigdata.juc.chapter02;

import java.util.concurrent.*;

/**
 * @Author rookie
 * @Description
 * @Date 2025/5/11 9:40
 * @Version 1.0
 */
public class CompletableFutureBuildDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        m1();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

//        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
//            System.out.println(Thread.currentThread().getName());
//            try {
//                TimeUnit.SECONDS.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        },executorService);
//
//        System.out.println(completableFuture.get()); //null
        CompletableFuture<String> objectCompletableFuture = CompletableFuture.supplyAsync(()->{
            System.out.println(Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hello supplyAsync";
        },executorService);

        System.out.println(objectCompletableFuture.get());//hello supplyAsync

        executorService.shutdown();

    }

    private static void m1() throws InterruptedException, ExecutionException {
        //        CompletableFuture<String> completableFuture=new CompletableFuture<>();
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
            System.out.println(Thread.currentThread().getName() + "\t" + "*****");

            //暂停几秒钟线程
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        System.out.println(completableFuture.get());
    }
}
