package com.rookie.bigdata.designpatterns.singleton.runoob.v3;

/**
 * @Class Singleton
 * @Description 懒汉式，线程安全
 * @Author rookie
 * @Date 2025/5/14 22:04
 * @Version 1.0
 */
public class Singleton {
    private static Singleton instance;
    private Singleton (){}
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
