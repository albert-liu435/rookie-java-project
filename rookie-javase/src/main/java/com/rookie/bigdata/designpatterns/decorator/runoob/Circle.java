package com.rookie.bigdata.designpatterns.decorator.runoob;

/**
 * @Class Circle
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:31
 * @Version 1.0
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
