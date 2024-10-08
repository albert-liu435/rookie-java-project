package com.rookie.bigdata.generic.generic3;

/**
 * @Class Test
 * @Description
 * @Author rookie
 * @Date 2024/7/4 16:53
 * @Version 1.0
 */
public class Test<U> {
    // 该方法只是使用了泛型类定义的类型参数，不是泛型方法
    public void testMethod(U u){
        System.out.println(u);
    }

    // <T> 真正声明了下面的方法是一个泛型方法
    public <T> T testMethod1(T t){
        return t;
    }
}
