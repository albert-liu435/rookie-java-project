package com.rookie.bigdata.designpatterns.bridge.shape;

/**
 * @Class Shape
 * @Description
 * @Author rookie
 * @Date 2024/5/30 16:42
 * @Version 1.0
 */
public abstract class Shape {
    protected final DrawApi drawApi;

    public Shape(DrawApi api) {
        this.drawApi = api;
    }

    public abstract void draw();
}
