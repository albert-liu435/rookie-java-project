package com.rookie.bigdata.designpatterns.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Class ProxyFactory
 * @Description
 * @Author rookie
 * @Date 2024/8/30 10:59
 * @Version 1.0
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object build() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new Interceptor());
    }

    class Interceptor implements InvocationHandler {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("before...");
            method.invoke(target, args);
            System.out.println("after...");
            return null;
        }
    }
}
