package com.rookie.bigdata.designpatterns.bridge;

/**
 * @Class BridgeExample
 * @Description
 * @Author rookie
 * @Date 2023/5/6 16:01
 * @Version 1.0
 */
public class BridgeExample {

    public static void main(String[] args) {
        IMessage smsMessage = new SmsMessage();
        AbstractMessage normalMessage = new NormalMessage(smsMessage);
        normalMessage.sendMessage("asd", "ericchen");
        smsMessage = new EmailMessage();
    }
}
