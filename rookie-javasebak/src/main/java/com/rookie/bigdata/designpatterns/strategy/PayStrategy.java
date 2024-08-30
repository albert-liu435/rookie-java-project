package com.rookie.bigdata.designpatterns.strategy;

/**
 * @Class PayStrategy
 * @Description 支付策略
 * @Author rookie
 * @Date 2023/5/6 9:36
 * @Version 1.0
 */
public interface PayStrategy {

    /**
     * @param account       支付账号
     * @param paymentAmount 支付金额
     */
    void pay(String account, int paymentAmount);
}
