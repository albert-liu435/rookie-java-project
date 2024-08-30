package com.rookie.bigdata.designpatterns.proxy.cglib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class ProxyFactoryTest
 * @Description
 * @Author rookie
 * @Date 2024/8/30 11:03
 * @Version 1.0
 */
class ProxyFactoryTest {


    @Test
    void test01(){
        ProxyFactory proxyFactory = new ProxyFactory(new PrinterImpl());
        Printer printer = (Printer)proxyFactory.build();
        printer.print();
        printer.print("nameA","ageA");
    }

}
