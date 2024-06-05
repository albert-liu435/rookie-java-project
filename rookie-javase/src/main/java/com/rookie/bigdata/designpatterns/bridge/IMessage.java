package com.rookie.bigdata.designpatterns.bridge;

/**
 * @Class IMessage
 * @Description
 * @Author rookie
 * @Date 2023/5/6 15:58
 * @Version 1.0
 */
public interface IMessage {

    void send(String message, String address);
}

