package com.rookie.bigdata.designpatterns.decorator.runoob;

/**
 * @Class Rectangle
 * @Description 创建实现接口的实体类。
 * @Author rookie
 * @Date 2025/5/15 16:30
 * @Version 1.0
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
