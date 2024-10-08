package com.rookie.bigdata.designpatterns.singleton;

/**
 * 单例-懒汉式
 * <p>
 * 优点：第一次调用才初始化，避免内存浪费
 * 缺点：必须加锁synchronized才能保证单例，但加锁会影响效率
 * <p>
 * getInstance()的性能对应用程序不是很关键（该方法使用不太频繁）
 * 但是每次访问时都要同步，会影响性能，且消耗更多的资源，这是懒汉式单例的缺点，
 * 所以衍生出了 双检锁/双重校验锁(DCL，即 Double-Checked Locking) 的方式
 *
 * @Class LazySingleton
 * @Description
 * @Author rookie
 * @Date 2023/5/6 14:23
 * @Version 1.0
 */
public class LazySingleton {

    /**
     * 单例-INSTANCE
     */
    private static /*volatile*/ LazySingleton INSTANCE;

    /**
     * 私有构造，不能直接New
     */
    private LazySingleton() {
    }

    /**
     * 单例获取静态方法
     */
    public static synchronized LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

}
