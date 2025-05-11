package com.rookie.bigdata.juc.chapter02;

import java.util.concurrent.*;

/**
 * @Author rookie
 * @Description
 * @Date 2025/5/11 8:59
 * @Version 1.0
 */
public class FutureThreadPoolDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        m1();


        long statTime=System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(3);


        //3个任务，目前只有一个线程main来处理，请问耗时多少
        FutureTask<String> futureTask1 = new FutureTask<>(()->{
            try{
                TimeUnit.MICROSECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "task1 over";
        });
        executorService.submit(futureTask1);

        //3个任务，目前只有一个线程main来处理，请问耗时多少
        FutureTask<String> futureTask2 = new FutureTask<>(()->{
            try{
                TimeUnit.MICROSECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "task2 over";
        });
        executorService.submit(futureTask2);


        System.out.println(futureTask1.get());

        System.out.println(futureTask2.get());

        try{
            TimeUnit.MICROSECONDS.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




        executorService.shutdown();

        long endTime=System.currentTimeMillis();


        System.out.println("耗时："+(endTime-statTime));

        System.out.println(Thread.currentThread().getName()+"\t------end");

    }

    private static void m1() {
        //3个任务，目前只有一个线程main来处理，请问耗时多少

        long statTime=System.currentTimeMillis();


        try{
            TimeUnit.MICROSECONDS.sleep(500);
        } catch (InterruptedException e) {
             e.printStackTrace();
        }
        try{
            TimeUnit.MICROSECONDS.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try{
            TimeUnit.MICROSECONDS.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime=System.currentTimeMillis();


        System.out.println("耗时："+(endTime-statTime));

        System.out.println(Thread.currentThread().getName()+"\t------end");
    }
}
