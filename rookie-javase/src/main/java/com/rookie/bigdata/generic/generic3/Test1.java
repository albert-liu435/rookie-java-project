package com.rookie.bigdata.generic.generic3;

/**
 * @Class Test1
 * @Description 特别注意的是：泛型类中定义的类型参数和泛型方法中定义的类型参数是相互独立的，它们一点关系都没有。
 * @Author rookie
 * @Date 2024/7/4 16:55
 * @Version 1.0
 */
public class Test1<T> {
    public void testMethod(T t) {
        System.out.println(t);
    }

    public <T> T testMethod1(T t) {
        return t;
    }
}

//上面代码中，Test< T > 是泛型类，testMethod() 是泛型类中的普通方法，其使用的类型参数是与泛型类中定义的类型参数。
//而 testMethod1() 是一个泛型方法，他使用的类型参数是与方法签名中声明的类型参数。
//虽然泛型类中定义的类型参数标识和泛型方法中定义的类型参数标识都为< T >，但它们彼此之间是相互独立的。也就是说，泛型方法始终以自己声明的类型参数为准。
//————————————————
//
//                            版权声明：本文为博主原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接和本声明。
//
//原文链接：https://blog.csdn.net/weixin_45395059/article/details/126006369


//  1. < T >表明该方法声明了一个类型参数 T，并且这个类型参数 T 只能在该方法中使用。
//  2. 为了避免混淆，如果在一个泛型类中存在泛型方法，那么两者的类型参数最好不要同名。
//  3. 与泛型类的类型参数定义一样，此处泛型方法中的 T 可以写为`任意标识`，常见的如 T、E、K、V 等形式的参数常用于表示泛型。
