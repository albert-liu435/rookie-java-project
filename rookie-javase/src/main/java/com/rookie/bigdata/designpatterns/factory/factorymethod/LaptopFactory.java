package com.rookie.bigdata.designpatterns.factory.factorymethod;

/**
 * @Class LaptopFactory
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 14:47
 * @Version 1.0
 */
public class LaptopFactory implements Factory{
    @Override
    public Product createProduct() {

        return new Laptop();
    }
}
