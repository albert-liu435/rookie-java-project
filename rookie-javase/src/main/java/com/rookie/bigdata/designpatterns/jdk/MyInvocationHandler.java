package com.rookie.bigdata.designpatterns.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Class MyInvocationHandler
 * @Description
 * @Author rookie
 * @Date 2024/1/25 11:11
 * @Version 1.0
 */
public class MyInvocationHandler implements InvocationHandler {

    // 目标对象
    private final Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy - " + proxy.getClass());
        System.out.println("method - " + method);
        System.out.println("args - " + Arrays.toString(args));
        return method.invoke(target, args);
    }
}
