package com.rookie.bigdata.designpatterns.bridge;

/**
 * @Class UpRightPhone
 * @Description
 * @Author rookie
 * @Date 2024/5/30 15:44
 * @Version 1.0
 */
public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("直立式手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("直立式手机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("直立式手机");
    }
}
