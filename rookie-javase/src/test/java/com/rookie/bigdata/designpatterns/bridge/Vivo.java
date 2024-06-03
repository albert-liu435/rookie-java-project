package com.rookie.bigdata.designpatterns.bridge;

/**
 * @Class Vivo
 * @Description
 * @Author rookie
 * @Date 2024/5/30 15:43
 * @Version 1.0
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo手机关机");

    }

    @Override
    public void call() {
        System.out.println("Vivo手机打电话");
    }
}
