package com.rookie.bigdata.designpatterns.prototype;

/**
 * @Class Rectangle
 * @Description
 * @Author rookie
 * @Date 2025/5/14 15:42
 * @Version 1.0
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
