package com.rookie.bigdata.designpatterns.factory;

import com.rookie.bigdata.designpatterns.factory.Shape;

/**
 * @Class Square
 * @Description
 * @Author rookie
 * @Date 2025/5/14 15:22
 * @Version 1.0
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
