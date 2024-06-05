package com.rookie.bigdata.netty103;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;

import java.nio.charset.Charset;


/**
 * @Class MyChannelInitializer
 * @Description
 * @Author rookie
 * @Date 2024/6/5 10:33
 * @Version 1.0
 */
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {


    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        //解码器
        //基于换行符
        channel.pipeline().addLast(new LineBasedFrameDecoder(1024));
        // 基于指定字符串【换行符，这样功能等同于LineBasedFrameDecoder】
        // e.pipeline().addLast(new DelimiterBasedFrameDecoder(1024, false, Delimiters.lineDelimiter()));
        // 基于最大长度
        // e.pipeline().addLast(new FixedLengthFrameDecoder(4));
        // 解码转String，注意调整自己的编码格式GBK、UTF-8
        channel.pipeline().addLast(new StringDecoder(Charset.forName("GBK")));
        //在管道中添加我们自己的接受数据实现的方法
        channel.pipeline().addLast(new MyServerHandler());


    }
}
