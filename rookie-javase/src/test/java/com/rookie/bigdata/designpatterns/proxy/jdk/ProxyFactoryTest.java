package com.rookie.bigdata.designpatterns.proxy.jdk;

import org.junit.jupiter.api.Test;


/**
 * @Class ProxyFactoryTest
 * @Description
 * @Author rookie
 * @Date 2024/8/30 11:04
 * @Version 1.0
 */
class ProxyFactoryTest {

    @Test
    void test01(){
        Printer printer = new PrinterImpl();
        ProxyFactory proxyFactory = new ProxyFactory(printer);
        Printer printer2 = (Printer)proxyFactory.build();
        printer2.print();
        printer2.print("nameB","ageB");
    }

}
