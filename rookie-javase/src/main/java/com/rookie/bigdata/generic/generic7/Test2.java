package com.rookie.bigdata.generic.generic7;

import java.util.ArrayList;

/**
 * @Class Test2
 * @Description
 * @Author rookie
 * @Date 2024/7/8 16:58
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        // 创建一个 ArrayList<? super Number> 集合
        ArrayList<Number> list = new ArrayList();
        // 往集合中添加 Number 类及其子类对象
        list.add(new Integer(1));
        list.add(new Float(1.1));
        // 调用 fillNumList() 方法，传入 ArrayList<Number> 集合
        fillNumList(list);
        System.out.println(list);
    }

    public static void fillNumList(ArrayList<? super Number> list) {
        list.add(new Integer(0));
        list.add(new Float(1.0));
    }
}

