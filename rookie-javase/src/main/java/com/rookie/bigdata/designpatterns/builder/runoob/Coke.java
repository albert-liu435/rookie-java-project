package com.rookie.bigdata.designpatterns.builder.runoob;

/**
 * @Class Coke
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:03
 * @Version 1.0
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
