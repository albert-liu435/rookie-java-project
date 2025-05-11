package com.rookie.bigdata.jvm.two.chapter01;

/**
 * @Author rookie
 * @Description
 * @Date 2025/4/23 23:47
 * @Version 1.0
 */
public class StringTest {
    public static void main(String[] args) {
        String str=new String("hello")+new String("world");

        String str1="helloworld";

        System.out.println(str1==str);

        String str2=new String("hellowrld");
        System.out.println(str==str2);
    }
}
