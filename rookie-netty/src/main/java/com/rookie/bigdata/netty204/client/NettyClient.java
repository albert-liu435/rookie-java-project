package com.rookie.bigdata.netty204.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @Class NettyClient
 * @Description
 * @Author rookie
 * @Date 2024/6/5 17:03
 * @Version 1.0
 */
public class NettyClient {

    //配置服务端NIO线程组
    private EventLoopGroup workerGroup=new NioEventLoopGroup();
    private Channel channel;

    public ChannelFuture connect(String inetHost,int inetPort){
        ChannelFuture channelFuture=null;

        try {
            Bootstrap b=new Bootstrap();
            b.group(workerGroup)
                    .channel(NioSocketChannel.class)
                    .option(ChannelOption.AUTO_READ,true)
                    .handler(new MyChannelInitializer());
            channelFuture=b.connect(inetHost,inetPort).syncUninterruptibly();
            this.channel=channelFuture.channel();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != channelFuture && channelFuture.isSuccess()) {
                System.out.println("itstack-demo-netty client start done. {关注公众号：bugstack虫洞栈，获取源码}");
            } else {
                System.out.println("itstack-demo-netty client start error. {关注公众号：bugstack虫洞栈，获取源码}");
            }
        }
        return channelFuture;
    }

    public void destroy() {
        if (null == channel) return;
        channel.close();
        workerGroup.shutdownGracefully();
    }

}
