package com.rookie.bigdata.designpatterns.singleton;

/**
 * @Class InnerSingletonInnerSingleton
 * @Description
 * @Author rookie
 * @Date 2023/5/6 14:25
 * @Version 1.0
 */
public class InnerSingleton {

    /**
     * 私有构造，不能直接New
     */
    private InnerSingleton() {
    }

    /**
     * 静态内部类
     */
    private static class SingletonHolder {

        /**
         * 单例-INSTANCE
         */
        private static final InnerSingleton INSTANCE = new InnerSingleton();

    }

    /**
     * 单例获取静态方法
     */
    public static InnerSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
