package com.rookie.bigdata.designpatterns.bridge.runoob;

/**
 * @Class Shape
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:22
 * @Version 1.0
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
