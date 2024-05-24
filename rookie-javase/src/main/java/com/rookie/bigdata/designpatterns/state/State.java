package com.rookie.bigdata.designpatterns.state;

/**
 * @Class State
 * @Description 抽象状态类  https://kongzi.blog.csdn.net/article/details/103387094
 * @Author rookie
 * @Date 2023/5/6 17:13
 * @Version 1.0
 */
public interface State {
    /**
     * 状态对应的处理
     */
    public void handle(String sampleParameter);
}