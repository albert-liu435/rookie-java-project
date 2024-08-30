package com.rookie.bigdata.designpatterns.mediator.two;

/**
 * @Class ClassLeader
 * @Description
 * @Author rookie
 * @Date 2023/5/6 17:37
 * @Version 1.0
 */
//班干部接口
public interface ClassLeader {
    //本职工作
    void job();
    //向班长提出请求
    void sendRequest();
}
