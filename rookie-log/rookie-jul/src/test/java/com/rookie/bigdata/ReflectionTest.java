package com.rookie.bigdata;

import org.testng.annotations.Test;
import sun.reflect.Reflection;

/**
 * @Class ReflectionTest
 * @Description
 * @Author rookie
 * @Date 2024/6/20 17:35
 * @Version 1.0
 */
public class ReflectionTest {


    @Test
    public void getCallerClass() {

        Class<?> callerClass = Reflection.getCallerClass();
        String s = callerClass.toString();
        System.out.println(s);
    }


}
