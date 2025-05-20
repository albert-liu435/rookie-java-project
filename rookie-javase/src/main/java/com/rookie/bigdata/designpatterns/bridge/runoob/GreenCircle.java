package com.rookie.bigdata.designpatterns.bridge.runoob;

/**
 * @Class GreenCircle
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:21
 * @Version 1.0
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
