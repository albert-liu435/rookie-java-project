package com.rookie.bigdata.designpatterns.strategy;

/**
 * @Class PayPalStrategy
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 9:38
 * @Version 1.0
 */
public class PayPalStrategy implements PayStrategy {
    @Override
    public void pay(String account, int paymentAmount) {
        System.out.println("使用 PayPal 付款");
        System.out.println("账户:" + account + " ,支付金额:" + paymentAmount);
    }
}
