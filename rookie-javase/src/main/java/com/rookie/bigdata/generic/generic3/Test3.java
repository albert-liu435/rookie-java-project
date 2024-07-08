package com.rookie.bigdata.generic.generic3;

/**
 * @Class Test3
 * @Description
 * @Author rookie
 * @Date 2024/7/4 17:06
 * @Version 1.0
 */
public class Test3 {

    // 这是一个简单的泛型方法
    public static <T> T add(T x, T y) {
        return y;
    }
}

//在调用泛型方法的时候，可以显式地指定类型参数，也可以不指定。
//
//当泛型方法的形参列表中有多个类型参数时，在不指定类型参数的情况下，方法中声明的的类型参数为泛型方法中的几种类型参数的共同父类的最小级，直到 Object。
//在指定了类型参数的时候，传入泛型方法中的实参的数据类型必须为指定数据类型或者其子类。
//————————————————
//
//                            版权声明：本文为博主原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接和本声明。
//
//原文链接：https://blog.csdn.net/weixin_45395059/article/details/126006369
