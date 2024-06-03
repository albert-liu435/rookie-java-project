package com.rookie.bigdata.designpatterns.bridge.shape;

/**
 * @Class BridgePatternDemo
 * @Description
 * @Author rookie
 * @Date 2024/5/30 16:44
 * @Version 1.0
 */
public class BridgePatternDemo {
    public static void main(String[] args) {

        RedDraw redDraw = new RedDraw();
        BlueDraw blueDraw = new BlueDraw();

        Shape red = new Circle(redDraw);
        Shape blue = new Circle(blueDraw);
        red.draw();
        blue.draw();

        red = new Square(redDraw);
        blue = new Square(blueDraw);
        red.draw();
        blue.draw();
    }
}
