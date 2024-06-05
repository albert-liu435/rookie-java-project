package com.rookie.bigdata.netty204.client;

import com.rookie.bigdata.netty204.codec.ObjDecoder;
import com.rookie.bigdata.netty204.codec.ObjEncoder;
import com.rookie.bigdata.netty204.domain.FileTransferProtocol;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

/**
 * @Class MyChannelInitializer
 * @Description
 * @Author rookie
 * @Date 2024/6/5 17:07
 * @Version 1.0
 */
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {


    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        //对象传输处理
        channel.pipeline().addLast(new ObjDecoder(FileTransferProtocol.class));
        channel.pipeline().addLast(new ObjEncoder(FileTransferProtocol.class));

        //在管道中添加我们自己的接受数据的实现方法
        channel.pipeline().addLast(new MyClientHandler());
    }
}
