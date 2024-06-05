package com.rookie.bigdata.netty100.nio.server;

import com.rookie.bigdata.netty100.nio.ChannelAdapter;
import com.rookie.bigdata.netty100.nio.ChannelHandler;

import java.io.IOException;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Class NioServerHandler
 * @Description
 * @Author rookie
 * @Date 2024/6/4 17:54
 * @Version 1.0
 */
public class NioServerHandler extends ChannelAdapter {

    public NioServerHandler(Selector selector, Charset charset) {
        super(selector, charset);
    }


    @Override
    public void channelActive(ChannelHandler ctx) {

        try {
            System.out.println("链接报告LocalAddress:" + ctx.channel().getLocalAddress());
            ctx.writeAndFlush("hi! 我是bugstack虫洞栈 NioServer to msg for you \r\n");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void channelRead(ChannelHandler ctx, Object msg) {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " 接收到消息：" + msg);
        ctx.writeAndFlush("hi 我已经收到你的消息Success！\r\n");
    }
}
