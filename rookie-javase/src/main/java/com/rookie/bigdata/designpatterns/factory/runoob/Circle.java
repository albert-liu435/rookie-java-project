package com.rookie.bigdata.designpatterns.factory.runoob;

/**
 * @Class Circle
 * @Description
 * @Author rookie
 * @Date 2025/5/14 20:58
 * @Version 1.0
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
