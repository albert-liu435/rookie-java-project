package com.rookie.bigdata.designpatterns.bridge.shape;

/**
 * @Class Square
 * @Description
 * @Author rookie
 * @Date 2024/5/30 16:42
 * @Version 1.0
 */
public class Square extends Shape {

    public Square(DrawApi api) {
        super(api);
    }

    @Override
    public void draw() {
        System.out.println("Draw Square: " + drawApi.draw());
    }
}
