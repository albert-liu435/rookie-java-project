package com.rookie.bigdata.designpatterns.singleton.runoob.v5;

/**
 * @Class Singleton
 * @Description 双检锁/双重校验锁（DCL，即 double-checked locking）
 * @Author rookie
 * @Date 2025/5/14 22:04
 * @Version 1.0
 */
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton (){}
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
