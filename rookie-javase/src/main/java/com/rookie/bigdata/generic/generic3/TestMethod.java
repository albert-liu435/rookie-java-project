package com.rookie.bigdata.generic.generic3;

/**
 * @Class TestMethod
 * @Description 泛型方法中可以同时声明多个类型参数。
 * @Author rookie
 * @Date 2024/7/4 16:54
 * @Version 1.0
 */
public class TestMethod<U> {
    public <T, S> T testMethod(T t, S s) {
        return null;
    }
}
