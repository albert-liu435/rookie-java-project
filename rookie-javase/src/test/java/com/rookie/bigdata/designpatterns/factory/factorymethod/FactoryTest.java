package com.rookie.bigdata.designpatterns.factory.factorymethod;

import org.junit.jupiter.api.Test;


/**
 * @Class FactoryTest
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 14:47
 * @Version 1.0
 */
class FactoryTest {


    @Test
    void createProduct() {

        Factory factory = new LaptopFactory();
        Product product = factory.createProduct();
        System.out.println(product);

        Factory factory1 = new PhoneFactory();
        Product product1 = factory1.createProduct();
        System.out.println(product1);

    }

}