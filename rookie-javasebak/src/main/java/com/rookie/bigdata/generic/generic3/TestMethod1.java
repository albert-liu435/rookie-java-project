package com.rookie.bigdata.generic.generic3;

/**
 * @Class TestMethod1
 * @Description （3）泛型方法中也可以使用泛型类中定义的泛型参数。
 * @Author rookie
 * @Date 2024/7/4 16:54
 * @Version 1.0
 */
public class TestMethod1<U> {
    public <T> U testMethod(T t, U u) {
        return u;
    }
}
