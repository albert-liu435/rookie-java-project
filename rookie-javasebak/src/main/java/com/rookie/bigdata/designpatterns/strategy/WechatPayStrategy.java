package com.rookie.bigdata.designpatterns.strategy;

/**
 * @Class WechatPayStrategy
 * @Description 微信支付
 * @Author rookie
 * @Date 2023/5/6 9:39
 * @Version 1.0
 */
public class WechatPayStrategy implements PayStrategy {
    @Override
    public void pay(String account, int paymentAmount) {
        System.out.println("使用微信支付付款");
        System.out.println("账户:" + account + " ,支付金额:" + paymentAmount);
    }
}
