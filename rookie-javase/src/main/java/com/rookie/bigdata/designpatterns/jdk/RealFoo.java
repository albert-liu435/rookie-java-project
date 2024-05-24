package com.rookie.bigdata.designpatterns.jdk;

/**
 * @Class RealFoo
 * @Description
 * @Author rookie
 * @Date 2024/1/25 11:11
 * @Version 1.0
 */
public class RealFoo implements Foo {

    @Override
    public String ping(String name) {
        System.out.println("ping");
        return "pong";
    }

}
