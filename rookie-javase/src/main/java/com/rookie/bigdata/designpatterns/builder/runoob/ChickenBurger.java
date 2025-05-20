package com.rookie.bigdata.designpatterns.builder.runoob;

/**
 * @Class ChickenBurger
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:02
 * @Version 1.0
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
