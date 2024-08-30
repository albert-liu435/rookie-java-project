package com.rookie.bigdata.designpatterns.strategy;

/**
 * @Class PayContext
 * @Description 环境(Context)类：持有一个策略类的引用，最终给客户端调用
 * @Author rookie
 * @Date 2023/5/6 9:40
 * @Version 1.0
 */
public class PayContext {

    private PayStrategy payStrategy;

    public PayContext(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }


    public void executeStrategy(String account, int paymentAmount) {
        payStrategy.pay(account, paymentAmount);
    }
}
