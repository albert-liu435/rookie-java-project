//package com.rookie.bigdata.netty206.web;
//
//import org.itstack.demo.netty.server.NettyServer;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
///**
// * 虫洞栈：https://bugstack.cn
// * 公众号：bugstack虫洞栈  ｛获取学习源码｝
// * Create by fuzhengwei on 2019
// */
//@RestController
//public class NettyController {
//
//    @Resource
//    private NettyServer nettyServer;
//
//    @RequestMapping("/localAddress")
//    public String localAddress() {
//        return "nettyServer localAddress " + nettyServer.getChannel().localAddress();
//    }
//
//}
