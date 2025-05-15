package com.rookie.bigdata.designpatterns.builder.runoob;

/**
 * @Class Bottle
 * @Description 创建实现 Packing 接口的实体类。
 * @Author rookie
 * @Date 2025/5/15 16:00
 * @Version 1.0
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
