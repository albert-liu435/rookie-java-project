package com.rookie.bigdata.designpatterns.singleton.runoob.v1;

/**
 * @Class SingletonPatternDemo
 * @Description
 * @Author rookie
 * @Date 2025/5/14 21:51
 * @Version 1.0
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();

        //显示消息
        object.showMessage();
    }
}
