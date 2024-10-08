package com.rookie.bigdata.netty100.nio.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

/**
 * @Class NioClient
 * @Description
 * @Author rookie
 * @Date 2024/6/4 17:56
 * @Version 1.0
 */
public class NioClient {

    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);

        boolean isConnect = socketChannel.connect(new InetSocketAddress("127.0.0.1", 7397));
        if (isConnect) {
            socketChannel.register(selector, SelectionKey.OP_READ);
        } else {
            socketChannel.register(selector, SelectionKey.OP_CONNECT);
        }
        System.out.println("itstack-demo-netty nio client start done. {关注公众号：bugstack虫洞栈 | 欢迎关注&获取源码}");
        new NioClientHandler(selector, Charset.forName("GBK")).start();
    }

}
