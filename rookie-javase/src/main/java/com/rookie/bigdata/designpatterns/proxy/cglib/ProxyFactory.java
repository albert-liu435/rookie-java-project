package com.rookie.bigdata.designpatterns.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Class ProxyFactory
 * @Description https://blog.csdn.net/xtrans/article/details/136783971
 * @Author rookie
 * @Date 2024/8/30 11:02
 * @Version 1.0
 */
public class ProxyFactory implements MethodInterceptor {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object build() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object arg0, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("before...");
        method.invoke(target,args);
        System.out.println("after...");
        return null;
    }
}
