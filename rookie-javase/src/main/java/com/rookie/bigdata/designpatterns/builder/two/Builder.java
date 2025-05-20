package com.rookie.bigdata.designpatterns.builder.two;

/**
 * @Class Builder
 * @Description
 * @Author rookie
 * @Date 2025/5/14 13:53
 * @Version 1.0
 */
/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
