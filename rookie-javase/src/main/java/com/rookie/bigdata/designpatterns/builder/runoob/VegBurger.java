package com.rookie.bigdata.designpatterns.builder.runoob;

/**
 * @Class VegBurger
 * @Description 创建扩展了 Burger 和 ColdDrink 的实体类。
 * @Author rookie
 * @Date 2025/5/15 16:02
 * @Version 1.0
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
