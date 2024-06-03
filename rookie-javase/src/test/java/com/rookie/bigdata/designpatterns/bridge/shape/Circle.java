package com.rookie.bigdata.designpatterns.bridge.shape;

/**
 * @Class Circle
 * @Description
 * @Author rookie
 * @Date 2024/5/30 16:42
 * @Version 1.0
 */
public class Circle extends Shape {
    public Circle(DrawApi api) {
        super(api);
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle : " + drawApi.draw());
    }
}

