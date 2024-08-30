package com.rookie.bigdata.designpatterns.bridge;

/**
 * @Class SmsMessage
 * @Description
 * @Author rookie
 * @Date 2023/5/6 16:00
 * @Version 1.0
 */
public class SmsMessage implements IMessage {

    @Override
    public void send(String message, String address) {
        System.out.println("发送短信");
    }
}
