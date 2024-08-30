package com.rookie.bigdata.designpatterns.strategy;

import lombok.Builder;
import lombok.Data;

/**
 * @Class Order
 * @Description
 * @Author rookie
 * @Date 2023/5/6 9:43
 * @Version 1.0
 */
@Data
@Builder
public class Order {
    private String account;
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(PayStrategy strategy) {
        strategy.pay(account, totalCost);
    }
}
