package com.rookie.bigdata.designpatterns.bridge.two;

/**
 * @Class AdvancedRemote
 * @Description
 * @Author rookie
 * @Date 2025/5/14 14:02
 * @Version 1.0
 */
public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
