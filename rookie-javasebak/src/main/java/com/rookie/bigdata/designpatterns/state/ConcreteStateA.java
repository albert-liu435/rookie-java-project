package com.rookie.bigdata.designpatterns.state;

/**
 * @Class ConcreteStateA
 * @Description 具体状态类
 * @Author rookie
 * @Date 2023/5/6 17:13
 * @Version 1.0
 */
public class ConcreteStateA implements State {
    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateA handle ：" + sampleParameter);
    }

}

