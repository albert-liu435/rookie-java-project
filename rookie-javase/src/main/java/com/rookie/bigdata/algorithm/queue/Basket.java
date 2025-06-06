package com.rookie.bigdata.algorithm.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Class Basket
 * @Description 定义装苹果的篮子 https://www.cnblogs.com/lemon-flm/p/7877898.html
 * https://www.cnblogs.com/mantu/p/5802393.html
 * @Author rookie
 * @Date 2025/5/20 11:46
 * @Version 1.0
 */
public class Basket {

    //篮子，能够容纳3个苹果
    BlockingQueue<String> basket = new ArrayBlockingQueue<String>(3);

    //生产苹果，放入篮子
    public void produce() throws InterruptedException {
        String apple = "apple " + System.currentTimeMillis();
        System.out.println("生产者生产：" + apple);
        basket.put(apple);
    }

    //消费苹果，从篮子中取走
    public String consume() throws InterruptedException {
        // get方法取出一个苹果，若basket为空，等到basket有苹果为止
        String apple = basket.take();
        System.out.println("消费者消费：" + apple);
        return apple;
    }

    public int getAppleNumber() {
        return basket.size();
    }

    //　测试方法
    public static void testBasket() {
        // 建立一个装苹果的篮子
        final Basket basket = new Basket();
        // 定义苹果生产者
        class Producer implements Runnable {
            public void run() {
                try {
                    while (true) {
                        // 生产苹果
                        System.out.println("生产者准备生产苹果："
                                + System.currentTimeMillis());
                        basket.produce();
                        System.out.println("生产者生产苹果完毕："
                                + System.currentTimeMillis());
                        System.out.println("生产完后有苹果："+basket.getAppleNumber()+"个");
                        // 休眠300ms
                        Thread.sleep(300);
                    }
                } catch (InterruptedException ex) {
                }
            }
        }
        // 定义苹果消费者
        class Consumer implements Runnable {
            public void run() {
                try {
                    while (true) {
                        // 消费苹果
                        System.out.println("消费者准备消费苹果："
                                + System.currentTimeMillis());
                        basket.consume();
                        System.out.println("消费者消费苹果完毕："
                                + System.currentTimeMillis());
                        System.out.println("消费完后有苹果："+basket.getAppleNumber()+"个");
                        // 休眠1000ms
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException ex) {
                }
            }
        }

        ExecutorService service = Executors.newCachedThreadPool();
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        service.submit(producer);
        service.submit(consumer);
        // 程序运行10s后，所有任务停止
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        service.shutdownNow();
    }

    public static void main(String[] args) {
        Basket.testBasket();
    }

}
