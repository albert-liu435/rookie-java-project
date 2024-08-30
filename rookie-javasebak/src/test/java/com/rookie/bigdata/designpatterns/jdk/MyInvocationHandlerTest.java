package com.rookie.bigdata.designpatterns.jdk;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;


/**
 * @Class MyInvocationHandlerTest
 * @Description https://segmentfault.com/a/1190000039303463
 * https://www.liaoxuefeng.com/wiki/1252599548343744/1264804593397984
 *https://juejin.cn/post/6844903744954433544
 *
 *
 *
 * @Author rookie
 * @Date 2024/1/25 11:11
 * @Version 1.0
 */
class MyInvocationHandlerTest {


    @Test
    public void test1() throws Exception {
        Foo foo = new RealFoo();
        // 根据类加载器和接口数组获取代理类的Class对象
        Class<?> proxyClass = Proxy.getProxyClass(Foo.class.getClassLoader(), Foo.class);

        // 通过Class对象的构造器创建一个实例（代理类的实例）
        Foo fooProxy = (Foo) proxyClass.getConstructor(InvocationHandler.class)
                .newInstance(new MyInvocationHandler(foo));

        // 调用 ping 方法，并输出返回值
        String value = fooProxy.ping("杨过");
        System.out.println(value);

    }

    @Test
    public void test2() {
        Foo foo = new RealFoo();
        // 通过类加载器、接口数组和调用处理器，创建代理类的实例
        Foo fooProxy = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
                new Class[]{Foo.class},
                new MyInvocationHandler(foo));
        String value = fooProxy.ping("小龙女");
        System.out.println(value);
    }


    @Test
    public void test3() {
        Foo foo = new RealFoo();

        Foo fooProxy = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
                new Class[]{Foo.class},
                (proxy, method, args) -> {
                    System.out.println("proxy - " + proxy.getClass());
                    System.out.println("method - " + method);
                    System.out.println("args - " + Arrays.toString(args));
                    return method.invoke(foo, args);
                });
        String value = fooProxy.ping("雕兄");
        System.out.println(value);
    }



}
