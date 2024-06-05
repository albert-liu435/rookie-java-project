package com.rookie.bigdata.netty100.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

/**
 * @Class ChannelHandler
 * @Description
 * @Author rookie
 * @Date 2024/6/4 17:31
 * @Version 1.0
 */
public class ChannelHandler {


    private SocketChannel channel;

    private Charset charset;


    public ChannelHandler(SocketChannel channel, Charset charset) {
        this.channel = channel;
        this.charset = charset;
    }


    public void writeAndFlush(Object msg) {

        try {
            byte[] bytes = msg.toString().getBytes(charset);
            ByteBuffer writeBuffer = ByteBuffer.allocate(bytes.length);
            writeBuffer.put(bytes);
            writeBuffer.flip();
            channel.write(writeBuffer);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public SocketChannel channel() {
        return channel;
    }

}
