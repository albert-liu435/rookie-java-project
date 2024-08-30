package com.rookie.bigdata.generic.generic7;

import java.util.ArrayList;

/**
 * @Class GenericType
 * @Description
 * @Author rookie
 * @Date 2024/7/8 16:44
 * @Version 1.0
 */
public class GenericType {
    public static void main(String[] args) {
        ArrayList<Number> list01 = new ArrayList<>();// 编译错误

        ArrayList<? extends Number> list02 = new ArrayList<Integer>();// 编译正确


//        ArrayList<? extends Number> 可以代表 ArrayList< Integer >、ArrayList< Float >、… 、ArrayList< Number >中的某一个集合，但我们不能指定 ArrayList<? extends Number> 的数据类型。（这里有点难理解）
//————————————————
//
//                            版权声明：本文为博主原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接和本声明。
//
//原文链接：https://blog.csdn.net/weixin_45395059/article/details/126006369



        ArrayList<? extends Number> list3 = new ArrayList<>();

//        list3.add(new Integer(1));// 编译错误
//        list3.add(new Float(1.0));// 编译错误
//        可以这样理解，ArrayList<? extends Number> 集合表示了：我这个集合可能是 ArrayList< Integer > 集合，也可能是 ArrayList< Float > 集合，… ，还可能是 ArrayList< Number > 集合；但到底是哪一个集合，不能确定；程序员也不能指定。
//
//        所以，在上面代码中，创建了一个 ArrayList<? extends Number> 集合 list，但我们并不能往 list 中添加 Integer、Float 等对象，这也说明了 list 集合并不是某个确定了数据类型的集合。
//
//

    }
}
