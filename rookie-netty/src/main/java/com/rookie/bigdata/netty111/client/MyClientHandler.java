package com.rookie.bigdata.netty111.client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Class MyClientHandler
 * @Description
 * @Author rookie
 * @Date 2024/6/5 11:50
 * @Version 1.0
 */
public class MyClientHandler extends SimpleChannelInboundHandler<DatagramPacket> {

    //接受服务端发送的内容
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket packet) throws Exception {
        String msg = packet.content().toString(Charset.forName("GBK"));
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " UDP客户端接收到消息：" + msg);
    }

}


