package com.rookie.bigdata.designpatterns.proxy.cglib;

/**
 * @Class PrinterImpl
 * @Description
 * @Author rookie
 * @Date 2024/8/30 11:28
 * @Version 1.0
 */
public class PrinterImpl implements Printer {

    @Override
    public void print() {
        System.out.println("print here!");
    }

    @Override
    public void print(String name, String age) {
        System.out.println("print here! name is: " + name + "; " + "age is:" + age);
    }
}
