package com.rookie.bigdata.common;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Class MyThreadPoolExecutor
 * @Description
 * @Author rookie
 * @Date 2023/5/6 14:13
 * @Version 1.0
 */
public class MyThreadPoolExecutor {
    public static void execute(Runnable runable) {
//        ThreadFactory threadFactory = new ThreadFactoryBuilder()
//                .setNameFormat("demo-pool-%d")
//                .build();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 100, 10L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(1024),
                new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.execute(runable);
        }
        threadPoolExecutor.shutdown();
    }
}
