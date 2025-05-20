package com.rookie.bigdata.jvm.one.chapter02;

/**
 * @Class ClinitTest
 * @Description
 * @Author rookie
 * @Date 2025/5/13 20:06
 * @Version 1.0
 */
public class ClinitTest {
    //任何一个类声明以后，内部至少存在一个类的构造器
    private int a = 1;
    private static int c = 3;
    public static void main(String[] args) {
        int b = 2;
    }

    public ClinitTest(){
        a = 10;
        int d = 20;
    }
}
