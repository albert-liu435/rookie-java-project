package com.rookie.bigdata.designpatterns.bridge;

/**
 * @Class AbstractMessage
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 16:00
 * @Version 1.0
 */
public abstract class AbstractMessage {

    IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }

    public void sendMessage(String message, String user) {
        //这里有点像代理模式,差距是这里是抽象类
        this.message.send(message, user);
    }
}