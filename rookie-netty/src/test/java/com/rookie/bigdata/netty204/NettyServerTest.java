package com.rookie.bigdata.netty204;

import com.rookie.bigdata.netty204.server.NettyServer;

/**
 * @Class NettyServerTest
 * @Description
 * @Author rookie
 * @Date 2024/6/5 17:22
 * @Version 1.0
 */
public class NettyServerTest {

    public static void main(String[] args) {
        System.out.println("hi 微信公众号：bugstack虫洞栈 | 欢迎关注&获取更多专题案例");
        //启动服务
        new NettyServer().bing(7397);
    }

}
