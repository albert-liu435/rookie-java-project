package com.rookie.bigdata.designpatterns.prototype.runoob;

/**
 * @Class Square
 * @Description
 * @Author rookie
 * @Date 2025/5/14 15:44
 * @Version 1.0
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
