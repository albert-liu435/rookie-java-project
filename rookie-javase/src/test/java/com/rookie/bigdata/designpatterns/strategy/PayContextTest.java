package com.rookie.bigdata.designpatterns.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class PayContextTest
 * @Description
 * @Author rookie
 * @Date 2023/5/6 9:42
 * @Version 1.0
 */
class PayContextTest {

    @Test
    void executeStrategy() {

        PayContext payContext=new PayContext(new AlipayStrategy());

        payContext.executeStrategy("a",100);


    }
}
