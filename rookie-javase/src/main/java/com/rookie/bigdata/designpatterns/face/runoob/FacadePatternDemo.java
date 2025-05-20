package com.rookie.bigdata.designpatterns.face.runoob;

/**
 * @Class FacadePatternDemo
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:44
 * @Version 1.0
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
