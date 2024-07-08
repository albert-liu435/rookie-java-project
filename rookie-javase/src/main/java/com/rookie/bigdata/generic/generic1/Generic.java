package com.rookie.bigdata.generic.generic1;

/**
 * @Class Generic
 * @Description
 * @Author rookie
 * @Date 2024/7/4 16:34
 * @Version 1.0
 */
public class Generic<T> {
    // key 这个成员变量的数据类型为 T, T 的类型由外部传入
    private T key;

    public Generic(){

    }

    // 泛型构造方法形参 key 的类型也为 T，T 的类型由外部传入
    public Generic(T key) {
        this.key = key;
    }

    // 泛型方法 getKey 的返回值类型为 T，T 的类型由外部指定
    public T getKey(){
        return key;
    }
}

//  1.非静态的成员属性类型
//  2.非静态方法的形参类型（包括非静态成员方法和构造器）
//  3.非静态的成员方法的返回值类型
