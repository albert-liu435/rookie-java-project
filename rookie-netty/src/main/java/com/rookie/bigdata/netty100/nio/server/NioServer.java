package com.rookie.bigdata.netty100.nio.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.charset.Charset;

/**
 * @Class NioServer
 * @Description
 * @Author rookie
 * @Date 2024/6/4 17:55
 * @Version 1.0
 */
public class NioServer {

    private Selector selector;
    private ServerSocketChannel socketChannel;

    public static void main(String[] args) throws IOException {
        new NioServer().bind(7397);
    }

    public void bind(int port) {
        try {
            selector = Selector.open();
            socketChannel = ServerSocketChannel.open();
            socketChannel.configureBlocking(false);
            socketChannel.socket().bind(new InetSocketAddress(port), 1024);
            socketChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("itstack-demo-netty nio server start done. {关注公众号：bugstack虫洞栈 | 欢迎关注&获取源码}");
            new NioServerHandler(selector, Charset.forName("GBK")).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
