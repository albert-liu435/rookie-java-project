package com.rookie.bigdata.designpatterns.bridge;

/**
 * @Class FoldedPhone
 * @Description 折叠式手机类，继承 抽象类 Phone
 * @Author rookie
 * @Date 2024/5/30 15:45
 * @Version 1.0
 */
public class FoldedPhone extends Phone {

    //构造器
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println(" 折叠样式手机 ");
    }

    public void close() {
        super.close();
        System.out.println(" 折叠样式手机 ");
    }

    public void call() {
        super.call();
        System.out.println(" 折叠样式手机 ");
    }
}
