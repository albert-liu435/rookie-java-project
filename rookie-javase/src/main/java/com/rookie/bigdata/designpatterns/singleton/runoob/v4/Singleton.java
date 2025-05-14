package com.rookie.bigdata.designpatterns.singleton.runoob.v4;

/**
 * @Class Singleton
 * @Description
 * @Author rookie
 * @Date 2025/5/14 22:04
 * @Version 1.0
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton (){}
    public static Singleton getInstance() {
        return instance;
    }
}
