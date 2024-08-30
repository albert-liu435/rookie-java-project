package com.rookie.bigdata.designpatterns.state;

/**
 * @Class Context
 * @Description 环境角色类
 * @Author rookie
 * @Date 2023/5/6 17:13
 * @Version 1.0
 */
public class Context {
    //持有一个State类型的对象实例
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 用户感兴趣的接口方法
     */
    public void request(String sampleParameter) {
        //转调state来处理
        state.handle(sampleParameter);
    }
}