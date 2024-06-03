package com.rookie.bigdata.designpatterns.bridge;

/**
 * @Class Phone
 * @Description Phone
 * @Author rookie
 * @Date 2024/5/30 15:40
 * @Version 1.0
 */
public abstract class Phone {
    //组合品牌
    private Brand brand;

    //构造器
    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.close();
    }

}
