package com.rookie.bigdata.designpatterns.bridge.runoob;

/**
 * @Class BridgePatternDemo
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:22
 * @Version 1.0
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
