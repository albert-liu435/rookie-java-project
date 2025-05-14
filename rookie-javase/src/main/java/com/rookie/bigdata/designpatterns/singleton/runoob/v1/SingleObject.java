package com.rookie.bigdata.designpatterns.singleton.runoob.v1;

/**
 * @Class SingleObject
 * @Description
 * @Author rookie
 * @Date 2025/5/14 21:50
 * @Version 1.0
 */
public class SingleObject {

    //创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
