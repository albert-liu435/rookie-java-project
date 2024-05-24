package com.rookie.bigdata.designpatterns.bridge;

/**
 * @Class NormalMessage
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 16:01
 * @Version 1.0
 */
public class NormalMessage extends AbstractMessage {


    public NormalMessage(IMessage message) {
        super(message);
    }
}
