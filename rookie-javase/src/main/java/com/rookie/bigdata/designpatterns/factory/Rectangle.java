package com.rookie.bigdata.designpatterns.factory;

/**
 * @Class Rectangle
 * @Description 创建实现接口的实体类
 * @Author rookie
 * @Date 2025/5/14 15:22
 * @Version 1.0
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
