package com.rookie.bigdata.netty100.aio.server;

import com.rookie.bigdata.netty100.aio.ChannelInitializer;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

/**
 * @Class AioServerChannelInitializer
 * @Description
 * @Author rookie
 * @Date 2024/6/5 9:16
 * @Version 1.0
 */
public class AioServerChannelInitializer extends ChannelInitializer {

    @Override
    protected void initChannel(AsynchronousSocketChannel channel) throws Exception {
        channel.read(ByteBuffer.allocate(1024), 10, TimeUnit.SECONDS, null, new AioServerHandler(channel, Charset.forName("GBK")));
    }

}
