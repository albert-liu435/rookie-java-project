package com.rookie.bigdata.designpatterns.singleton.runoob.v6;

/**
 * @Class Singleton
 * @Description 登记式/静态内部类
 * @Author rookie
 * @Date 2025/5/14 22:05
 * @Version 1.0
 */
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton (){}
    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
