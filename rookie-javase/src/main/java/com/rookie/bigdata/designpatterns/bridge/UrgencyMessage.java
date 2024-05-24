package com.rookie.bigdata.designpatterns.bridge;

/**
 * @Class UrgencyMessage
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 16:01
 * @Version 1.0
 */
public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(IMessage message) {
        super(message);
    }

    public void send(String message, String address) {
        System.out.println("加急");
        this.message.send(message, address);
    }
}
