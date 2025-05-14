package com.rookie.bigdata.designpatterns.singleton.runoob.v2;

/**
 * @Class Singleton
 * @Description 懒汉式，线程不安全
 * @Author rookie
 * @Date 2025/5/14 22:03
 * @Version 1.0
 */
public class Singleton {
    private static Singleton instance;
    private Singleton (){}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
