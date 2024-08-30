package com.rookie.bigdata.generic.generic1;

/**
 * @Class Test2
 * @Description
 * @Author rookie
 * @Date 2024/7/4 16:41
 * @Version 1.0
 */
public class Test2<T> {
    // 泛型类定义的类型参数 T 不能在静态方法中使用
    public static <E> E show(E one) { // 这是正确的，因为 E 是在静态方法签名中新定义的类型参数
        return null;
    }
}
