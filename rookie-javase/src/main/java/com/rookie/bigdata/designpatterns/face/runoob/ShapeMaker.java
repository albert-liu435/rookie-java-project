package com.rookie.bigdata.designpatterns.face.runoob;

/**
 * @Class ShapeMaker
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:43
 * @Version 1.0
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
