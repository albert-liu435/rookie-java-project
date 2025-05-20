package com.rookie.bigdata.designpatterns.builder.two;

/**
 * @Class TripComputer
 * @Description
 * @Author rookie
 * @Date 2025/5/14 13:57
 * @Version 1.0
 */

/**
 * Just another feature of a car.
 */
public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}

