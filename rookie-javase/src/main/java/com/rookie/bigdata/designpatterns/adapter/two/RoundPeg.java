package com.rookie.bigdata.designpatterns.adapter.two;

/**
 * @Class RoundPeg
 * @Description
 * @Author rookie
 * @Date 2025/5/14 13:47
 * @Version 1.0
 */
/**
 * RoundPegs are compatible with RoundHoles.
 */
public class RoundPeg {
    private double radius;

    public RoundPeg() {}

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
