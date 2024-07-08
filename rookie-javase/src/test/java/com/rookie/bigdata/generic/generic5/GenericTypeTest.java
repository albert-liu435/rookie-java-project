package com.rookie.bigdata.generic.generic5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * @Class GenericTypeTest
 * @Description
 * @Author rookie
 * @Date 2024/7/4 17:18
 * @Version 1.0
 */
class GenericTypeTest {


    @Test
    void test01(){
        List list = new ArrayList();
    }


    @Test
    void test02(){
        List<Integer> list = new ArrayList<Integer>();
    }


    @Test
    void test03(){
//        List<Number> list01 = new ArrayList<Integer>();// 编译错误
//
//        ArrayList<Number> list02 = new ArrayList<Integer>();// 编译错误
    }


    @Test
    void test04(){
        // 创建一个 ArrayList<Integer> 集合
        ArrayList<Integer> integerList = new ArrayList<>();

        // 添加一个 Integer 对象
        integerList.add(new Integer(123));

        // “向上转型”为 ArrayList<Number>
//        ArrayList<Number> numberList1 = integerList;
        ArrayList<Number> numberList1 = new ArrayList<>();

        // 添加一个 Float 对象，Float 也是 Number 的子类，编译器不报错
        numberList1.add(new Float(12.34));

        // 从 ArrayList<Integer> 集合中获取索引为 1 的元素（即添加的 Float 对象）：
        Integer n = integerList.get(1); // ClassCastException，运行出错
    }

}
