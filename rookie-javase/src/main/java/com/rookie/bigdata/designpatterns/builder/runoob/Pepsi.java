package com.rookie.bigdata.designpatterns.builder.runoob;

/**
 * @Class Pepsi
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:03
 * @Version 1.0
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
