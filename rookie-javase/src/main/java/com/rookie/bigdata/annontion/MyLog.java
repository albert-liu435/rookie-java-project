package com.rookie.bigdata.annontion;

import java.lang.reflect.Method;

/**
 * @Class MyLog
 * @Description
 * @Author rookie
 * @Date 2024/1/2 13:52
 * @Version 1.0
 */
public class MyLog {
    @Log("start my method")
    public void myMethod() {
        // do something
    }


    public static void main(String[] args) throws Exception{

        MyLog obj = new MyLog();
        Method method = obj.getClass().getMethod("myMethod");

        if (method.isAnnotationPresent(Log.class)) {
            Log log = method.getAnnotation(Log.class);
            System.out.println(log.value());
        }


    }
}
