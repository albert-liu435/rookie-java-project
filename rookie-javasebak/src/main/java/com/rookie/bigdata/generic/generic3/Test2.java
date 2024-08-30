package com.rookie.bigdata.generic.generic3;

/**
 * @Class Test2
 * @Description
 * @Author rookie
 * @Date 2024/7/4 16:58
 * @Version 1.0
 */
public class Test2<T> {
    // 泛型类定义的类型参数 T 不能在静态方法中使用
    // 但可以将静态方法声明为泛型方法，方法中便可以使用其声明的类型参数了
    public static <E> E show(E one) {
        return null;
    }
}


//补充一点：将静态方法声明为泛型方法
//
//前面在泛型类的定义中提到，在静态成员中不能使用泛型类定义的类型参数，但我们可以将静态成员方法定义为一个泛型方法。
