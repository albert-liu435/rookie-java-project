package com.rookie.bigdata.juc.chapter02;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author rookie
 * @Description
 * @Date 2025/5/11 15:02
 * @Version 1.0
 */
public class CompletableFutureApi2Demo {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        CompletableFuture.supplyAsync(() -> {
            return 1;
        }, threadPool).thenApply(f -> {
            return f + 2;
        }).thenApply(f -> {
            return f + 2;
        }).thenAccept(r -> {
            System.out.println(r);//5
        });
    }
}