package com.rookie.bigdata.designpatterns.adapter.two;

/**
 * @Class SquarePegAdapter
 * @Description
 * @Author rookie
 * @Date 2025/5/14 13:47
 * @Version 1.0
 */

/**
 * Adapter allows fitting square pegs into round holes.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
