package com.rookie.bigdata.designpatterns.bridge.pay;

import java.math.BigDecimal;

/**
 * @Class Pay
 * @Description TODO
 * @Author rookie
 * @Date 2024/5/30 17:03
 * @Version 1.0
 */
public abstract class Pay {

    //桥接对象
    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    //划账功能
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);

}
