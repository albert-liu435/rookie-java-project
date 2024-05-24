package com.rookie.bigdata.designpatterns.mediator.two;

/**
 * @Class Mediator
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 17:37
 * @Version 1.0
 */
//中介者接口类
public interface Mediator {
    //注册委员
    void register(String lname,ClassLeader c);
    //班长根据委员名字获得通知请求
    void command(String lname);

}

