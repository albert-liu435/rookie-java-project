package com.rookie.bigdata.designpatterns.builder.chain;

/**
 * @Class Test
 * @Description https://kongzi.blog.csdn.net/article/details/103140954
 * @Author rookie
 * @Date 2023/5/6 17:22
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        User user=new User.Builder().id("1").name("张三").password("123456")
                .phone("15820638007").build();
        System.out.println(user.toString());
    }
}