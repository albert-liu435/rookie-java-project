package com.rookie.bigdata.designpatterns.bridge.other;

/**
 * @Class JavaDemo
 * @Description https://kongzi.blog.csdn.net/article/details/103124287
 * @Author rookie
 * @Date 2023/5/6 17:29
 * @Version 1.0
 */
public class JavaDemo {
    public static void main(String[] args) {
        PhoneBrand brand1 = new BrandM();
        brand1.setSoft(new Game());
        brand1.run();

        brand1.setSoft(new AddressList());
        brand1.run();

        PhoneBrand brand2 = new BrandN();
        brand2.setSoft(new Game());
        brand2.run();

        brand2.setSoft(new AddressList());
        brand2.run();


    }
}

/**
 * 运行手机游戏
 * 品牌M
 * 运行通讯录
 * 品牌M
 * 运行手机游戏
 * 品牌N
 * 运行通讯录
 * 品牌N
 */