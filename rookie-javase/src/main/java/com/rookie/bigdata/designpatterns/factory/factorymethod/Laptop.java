package com.rookie.bigdata.designpatterns.factory.factorymethod;

/**
 * @Class DeskTop
 * @Description
 * @Author rookie
 * @Date 2023/5/6 14:35
 * @Version 1.0
 */
public class Laptop implements Product {
    @Override
    public String getName() {
        return "Laptop";
    }
}
