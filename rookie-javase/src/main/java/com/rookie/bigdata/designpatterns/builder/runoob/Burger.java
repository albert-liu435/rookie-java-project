package com.rookie.bigdata.designpatterns.builder.runoob;

/**
 * @Class Burger
 * @Description 创建实现 Item 接口的抽象类，该类提供了默认的功能。
 * @Author rookie
 * @Date 2025/5/15 16:01
 * @Version 1.0
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
