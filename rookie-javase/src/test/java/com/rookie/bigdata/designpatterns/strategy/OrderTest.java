package com.rookie.bigdata.designpatterns.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class OrderTest
 * @Description
 * @Author rookie
 * @Date 2023/5/6 9:44
 * @Version 1.0
 */
class OrderTest {

    @Test
    void processOrder() {

        Order order = Order.builder()
                .account("EricChen")
                .isClosed(false)
                .totalCost(100)
                .build();

        order.processOrder(new AlipayStrategy());
    }
}
