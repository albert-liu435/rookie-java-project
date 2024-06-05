package com.rookie.bigdata.netty203.server;

import com.rookie.bigdata.netty202.domain.MsgInfo;
import com.rookie.bigdata.netty203.codec.ObjDecoder;
import com.rookie.bigdata.netty203.codec.ObjEncoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

/**
 * @Class MyChannelInitializer
 * @Description
 * @Author rookie
 * @Date 2024/6/5 14:12
 * @Version 1.0
 */
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        //对象传输处理
        channel.pipeline().addLast(new ObjDecoder(MsgInfo.class));
        channel.pipeline().addLast(new ObjEncoder(MsgInfo.class));
        //在管道中添加我们自己的接受数据实现方法
        channel.pipeline().addLast(new MyServerHandler());

    }
}
