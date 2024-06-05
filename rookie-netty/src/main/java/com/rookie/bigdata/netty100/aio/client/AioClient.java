package com.rookie.bigdata.netty100.aio.client;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.charset.Charset;
import java.util.concurrent.Future;

/**
 * @Class AioClient
 * @Description
 * @Author rookie
 * @Date 2024/6/5 9:18
 * @Version 1.0
 */
public class AioClient {

    public static void main(String[] args) throws Exception {
        AsynchronousSocketChannel socketChannel = AsynchronousSocketChannel.open();
        Future<Void> future = socketChannel.connect(new InetSocketAddress("192.168.1.116", 7397));
        System.out.println("itstack-demo-netty aio client start done. {关注公众号：bugstack虫洞栈 | 欢迎关注&获取源码}");
        future.get();
        socketChannel.read(ByteBuffer.allocate(1024), null, new AioClientHandler(socketChannel, Charset.forName("GBK")));
        Thread.sleep(100000);
    }

}
