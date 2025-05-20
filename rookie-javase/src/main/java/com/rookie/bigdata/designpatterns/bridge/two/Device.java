package com.rookie.bigdata.designpatterns.bridge.two;

/**
 * @Class Device
 * @Description
 * @Author rookie
 * @Date 2025/5/14 14:00
 * @Version 1.0
 */
public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
