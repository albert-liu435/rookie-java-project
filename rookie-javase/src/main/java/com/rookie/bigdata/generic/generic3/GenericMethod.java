package com.rookie.bigdata.generic.generic3;

/**
 * @Class GenericMethod
 * @Description
 * @Author rookie
 * @Date 2024/7/4 17:00
 * @Version 1.0
 */
public class GenericMethod {
    // 普通的泛型方法
    public <T> T fun(T t) { // 可以接收任意类型的数据
        return t;
    }

    // 静态的泛型方法
    public static <E> void show(E one){
        System.out.println("静态泛型方法 " + one);
    }
}
