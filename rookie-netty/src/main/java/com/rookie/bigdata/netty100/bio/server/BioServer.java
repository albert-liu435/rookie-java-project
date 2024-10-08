package com.rookie.bigdata.netty100.bio.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * @Class BioServer
 * @Description
 * @Author rookie
 * @Date 2024/6/3 11:43
 * @Version 1.0
 */
public class BioServer extends Thread{
    private ServerSocket serverSocket = null;

    public static void main(String[] args) {
        BioServer bioServer = new BioServer();
        bioServer.start();
    }

    @Override
    public void run() {
        try {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress(7397));
            System.out.println("itstack-demo-netty bio server start done. {关注公众号：bugstack虫洞栈 | 欢迎关注&获取源码}");
            while (true) {
                //接受网络请求,这里会阻塞
                Socket socket = serverSocket.accept();
                System.out.println(socket);
                BioServerHandler handler = new BioServerHandler(socket, Charset.forName("GBK"));
                handler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
