package com.rookie.bigdata.designpatterns.jdk.demo;

import java.lang.reflect.Proxy;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class PersonInvocationHandlerTest
 * @Description
 * @Author rookie
 * @Date 2024/1/29 16:34
 * @Version 1.0
 */
class PersonInvocationHandlerTest {


    public static void main(String[] args) throws Exception {
        PersonInvocationHandler personInvocationHandler = new PersonInvocationHandler(
                new PersonImpl());
        Person personProxy = (Person) Proxy.newProxyInstance(
                PersonImpl.class.getClassLoader(),
                PersonImpl.class.getInterfaces(), personInvocationHandler);
        personProxy.eat();
    }


}
