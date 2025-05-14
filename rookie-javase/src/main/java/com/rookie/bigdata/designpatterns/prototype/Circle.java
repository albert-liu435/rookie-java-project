package com.rookie.bigdata.designpatterns.prototype;

/**
 * @Class Circle
 * @Description
 * @Author rookie
 * @Date 2025/5/14 15:43
 * @Version 1.0
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
