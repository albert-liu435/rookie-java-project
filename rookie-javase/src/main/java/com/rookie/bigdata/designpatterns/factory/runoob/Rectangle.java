package com.rookie.bigdata.designpatterns.factory.runoob;

/**
 * @Class Rectangle
 * @Description
 * @Author rookie
 * @Date 2025/5/14 20:57
 * @Version 1.0
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
