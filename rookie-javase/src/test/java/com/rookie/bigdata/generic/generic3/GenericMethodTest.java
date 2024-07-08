package com.rookie.bigdata.generic.generic3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class GenericMethodTest
 * @Description
 * @Author rookie
 * @Date 2024/7/4 17:02
 * @Version 1.0
 */
class GenericMethodTest {


    @Test
    void test01(){
        GenericMethod d = new GenericMethod(); // 创建 GenericMethod 对象

        String str = d.fun("汤姆"); // 给GenericMethod中的泛型方法传递字符串
        int i = d.fun(30);  // 给GenericMethod中的泛型方法传递数字，自动装箱
        System.out.println(str); // 输出 汤姆
        System.out.println(i);  // 输出 30

        GenericMethod.show("Lin");// 输出: 静态泛型方法 Lin
    }

}
