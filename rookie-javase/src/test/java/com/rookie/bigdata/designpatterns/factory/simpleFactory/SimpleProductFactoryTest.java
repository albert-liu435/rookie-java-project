package com.rookie.bigdata.designpatterns.factory.simpleFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class SimpleProductFactoryTest
 * @Description
 * @Author rookie
 * @Date 2023/5/6 14:37
 * @Version 1.0
 */
class SimpleProductFactoryTest {

    @Test
    void create() {
        SimpleProductFactory simpleProductFactory = new SimpleProductFactory();
        Product product = simpleProductFactory.create(SimpleProductFactory.IPHONE);
        System.out.println("通过工厂方法构建了一个手机" + product);

        SimpleProductFactory simpleProductFactory1 = new SimpleProductFactory();
        Product product1 = simpleProductFactory1.create(SimpleProductFactory.LAPTOP);
        System.out.println("通过工厂方法构建了一个笔记本电脑" + product1);
    }

    @Test
    void createWithPath() {
        SimpleProductFactory simpleProductFactory = new SimpleProductFactory();
        Product withPath = simpleProductFactory.createWithPath("com.rookie.bigdata.designpatterns.factory.simpleFactory.Iphone");
        System.out.println("通过工厂方法创建一个一个手机"+withPath);
    }

    @Test
    void testCreate() {
        SimpleProductFactory simpleProductFactory = new SimpleProductFactory();
        Product withPath = simpleProductFactory.create(Iphone.class);
        System.out.println("通过工厂方法创建一个一个手机"+withPath);
    }
}
