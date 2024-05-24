package com.rookie.bigdata.designpatterns.jdk.demo;

/**
 * @Class PersonInvocationHandler
 * @Description
 * @Author rookie
 * @Date 2024/1/29 16:33
 * @Version 1.0
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonInvocationHandler implements InvocationHandler {

    private Object obj;

    public PersonInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("before time to eat");
        method.invoke(obj, args);
        System.out.println("after time to eat");
        return null;
    }

}
