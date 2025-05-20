package com.rookie.bigdata.jvm.one.chapter01;

/**
 * @Class StackStruTest
 * @Description
 * @Author rookie
 * @Date 2025/5/13 19:24
 * @Version 1.0
 */
public class StackStruTest {


    public static void main(String[] args) {
//        int l = 2 + 3;

        int i = 2;
        int j = 3;
        int k = i + j;

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("hello");
    }


}
