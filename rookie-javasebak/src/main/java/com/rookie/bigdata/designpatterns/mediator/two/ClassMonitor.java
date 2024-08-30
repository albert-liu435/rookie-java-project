package com.rookie.bigdata.designpatterns.mediator.two;

import java.util.HashMap;
import java.util.Map;

/**
 * @Class ClassMonitor
 * @Description
 * @Author rookie
 * @Date 2023/5/6 17:39
 * @Version 1.0
 */
//班长
public class ClassMonitor implements Mediator {
    //利用map集合存放学委的相关属性
    private Map<String,ClassLeader> map=new HashMap<String,ClassLeader>();

    //将对应名称的学委对象进行注册
    @Override
    public void register(String lname, ClassLeader c) {
        map.put(lname, c);
    }
    //班长大人获取来自指定学委的请求通知
    @Override
    public void command(String lname) {
        map.get(lname).job();
    }
}
