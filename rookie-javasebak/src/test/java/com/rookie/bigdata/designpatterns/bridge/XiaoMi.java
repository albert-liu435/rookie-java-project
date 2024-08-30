package com.rookie.bigdata.designpatterns.bridge;

/**
 * @Class XiaoMi
 * @Description
 * @Author rookie
 * @Date 2024/5/30 15:42
 * @Version 1.0
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {

        System.out.println("小米手机打电话");

    }
}
