package com.rookie.bigdata.designpatterns.builder.two;

/**
 * @Class GPSNavigator
 * @Description
 * @Author rookie
 * @Date 2025/5/14 13:56
 * @Version 1.0
 */
/**
 * Just another feature of a car.
 */
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
