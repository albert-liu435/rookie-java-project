package com.rookie.bigdata.generic.generic4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class GenericTypeTest
 * @Description
 * @Author rookie
 * @Date 2024/7/4 17:10
 * @Version 1.0
 */
class GenericTypeTest {



    @Test
    void test01(){
        ArrayList<String> arrayString = new ArrayList<String>();
        ArrayList<Integer> arrayInteger = new ArrayList<Integer>();
        System.out.println(arrayString.getClass() == arrayInteger.getClass());// true

    }

}
//在这个例子中，我们定义了两个 ArrayList 集合，不过一个是 ArrayList< String>，只能存储字符串。一个是 ArrayList< Integer>，只能存储整型对象。我们通过 arrayString 对象和 arrayInteger 对象的 getClass() 方法获取它们的类信息并比较，发现结果为true。
//
//明明我们在 <> 中传入了两种不同的数据类型，按照上文所说的，它们的类型参数 T 不是应该被替换成我们传入的数据类型了吗，那为什么它们的类信息还是相同呢？ 这是因为，在编译期间，所有的泛型信息都会被擦除， ArrayList< Integer > 和 ArrayList< String >类型，在编译后都会变成ArrayList< Objec t>类型。
//————————————————
//
//                            版权声明：本文为博主原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接和本声明。
//
//原文链接：https://blog.csdn.net/weixin_45395059/article/details/126006369
