package com.rookie.bigdata.netty112;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;

/**
 * @Class MyChannelInitializer
 * @Description
 * @Author rookie
 * @Date 2024/6/5 13:44
 * @Version 1.0
 */
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) {
        // 数据解码操作
        channel.pipeline().addLast(new HttpResponseEncoder());
        // 数据编码操作
        channel.pipeline().addLast(new HttpRequestDecoder());
        // 在管道中添加我们自己的接收数据实现方法
        channel.pipeline().addLast(new MyServerHandler());
    }

}
