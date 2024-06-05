package com.rookie.bigdata.util.function;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;


/**
 * @Class ConsumerAcceptTest
 * @Description
 * @Author rookie
 * @Date 2023/5/5 17:48
 * @Version 1.0
 */
class ConsumerAcceptTest {


    @Test
    void test1() {

        //lambda表达式实例
        Consumer<String> consumer = (s) -> {
            System.out.println(s);
        };
        consumer.accept("hello consumer");

        //接口实现方法
        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        stringConsumer.accept("hello impl Consumer");


        Consumer<Integer> consumer1 = integer -> System.out.println(integer + 2);

        Consumer<Integer> consumer2 = integer -> System.out.println(integer + 3);

        Consumer<Integer> integerConsumer = consumer2.andThen(consumer1);
        //先打印出6,后再打印出5
        integerConsumer.accept(3);


    }

}
