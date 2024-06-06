package com.rookie.bigdata.netty207;

import com.rookie.bigdata.netty207.server.ServerSocket;

/**
 * @Class StartServer
 * @Description
 * @Author rookie
 * @Date 2024/6/6 9:18
 * @Version 1.0
 */
public class StartServer {

    public static void main(String[] args) {
        new Thread(new ServerSocket()).start();
        System.out.println("itstack-demo-netty server start done. {关注公众号：bugstack虫洞栈，获取源码}");
    }

}
