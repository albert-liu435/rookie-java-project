package com.rookie.bigdata.designpatterns.factory.factorymethod;

/**
 * @Class PhoneFactory
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 14:46
 * @Version 1.0
 */
public class PhoneFactory implements Factory{
    @Override
    public Product createProduct() {

        return new Iphone();
    }
}
