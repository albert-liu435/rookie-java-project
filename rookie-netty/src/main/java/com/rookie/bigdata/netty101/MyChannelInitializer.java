package com.rookie.bigdata.netty101;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

/**
 * @Class MyChannelInitializer
 * @Description
 * @Author rookie
 * @Date 2024/6/5 9:28
 * @Version 1.0
 */
public class MyChannelInitializer extends ChannelInitializer<SocketChannel>  {
    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        System.out.println("链接报告开始");
        System.out.println("链接报告信息：有一客户端链接到本服务端");
        System.out.println("链接报告IP:" + channel.localAddress().getHostString());
        System.out.println("链接报告Port:" + channel.localAddress().getPort());
        System.out.println("链接报告完毕");
    }
}
