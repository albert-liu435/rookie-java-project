package com.rookie.bigdata.designpatterns.adapter.two;

/**
 * @Class SquarePeg
 * @Description
 * @Author rookie
 * @Date 2025/5/14 13:47
 * @Version 1.0
 */
/**
 * SquarePegs are not compatible with RoundHoles (they were implemented by
 * previous development team). But we have to integrate them into our program.
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
