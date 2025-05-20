package com.rookie.bigdata.designpatterns.decorator.runoob;

/**
 * @Class RedShapeDecorator
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:32
 * @Version 1.0
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
