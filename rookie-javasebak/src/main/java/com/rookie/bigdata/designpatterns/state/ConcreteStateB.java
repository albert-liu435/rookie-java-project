package com.rookie.bigdata.designpatterns.state;

/**
 * @Class ConcreteStateB
 * @Description 具体状态类
 * @Author rookie
 * @Date 2023/5/6 17:13
 * @Version 1.0
 */
public class ConcreteStateB implements State {
    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateB handle ：" + sampleParameter);
    }

}