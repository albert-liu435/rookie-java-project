package com.rookie.bigdata.designpatterns.decorator.runoob;

/**
 * @Class ShapeDecorator
 * @Description 创建实现了 Shape 接口的抽象装饰类。
 * @Author rookie
 * @Date 2025/5/15 16:31
 * @Version 1.0
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
