package com.rookie.bigdata.netty100.bio.client;

import java.io.IOException;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * @Class BioClient
 * @Description
 * @Author rookie
 * @Date 2024/6/4 17:25
 * @Version 1.0
 */
public class BioClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 7397);
            System.out.println("itstack-demo-netty bio client start done. {关注公众号：bugstack虫洞栈 | 欢迎关注&获取源码}");
            BioClientHandler bioClientHandler = new BioClientHandler(socket, Charset.forName("utf-8"));
            bioClientHandler.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
