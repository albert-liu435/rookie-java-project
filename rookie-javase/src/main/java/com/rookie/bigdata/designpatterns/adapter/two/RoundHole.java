package com.rookie.bigdata.designpatterns.adapter.two;

/**
 * @Class RoundHole
 * @Description
 * @Author rookie
 * @Date 2025/5/14 13:46
 * @Version 1.0
 */
/**
 * RoundHoles are compatible with RoundPegs.
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
