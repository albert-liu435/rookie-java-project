package com.rookie.bigdata.designpatterns.strategy;

/**
 * @Class AlipayStrategy
 * @Description 支付宝支付
 * @Author rookie
 * @Date 2023/5/6 9:37
 * @Version 1.0
 */
public class AlipayStrategy implements PayStrategy {
    @Override
    public void pay(String account, int paymentAmount) {
        System.out.println("使用支付宝付款");
        System.out.println("账户:" + account + " ,支付金额:" + paymentAmount);

    }
}
