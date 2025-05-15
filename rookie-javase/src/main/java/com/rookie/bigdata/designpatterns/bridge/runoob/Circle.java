package com.rookie.bigdata.designpatterns.bridge.runoob;

/**
 * @Class Circle
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:22
 * @Version 1.0
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
