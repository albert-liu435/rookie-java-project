package com.rookie.bigdata.designpatterns.bridge;

/**
 * @Class SiteMessage
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 15:59
 * @Version 1.0
 */
public class SiteMessage implements IMessage {

    @Override
    public void send(String message, String address) {
        System.out.println("发送站内信");
    }
}
