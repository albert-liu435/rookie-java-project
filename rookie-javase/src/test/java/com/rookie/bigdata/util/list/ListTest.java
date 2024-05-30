package com.rookie.bigdata.util.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class ListTest
 * @Description
 * @Author rookie
 * @Date 2024/5/28 15:37
 * @Version 1.0
 */
public class ListTest {



    @Test
    public void test01(){

        List<String> list=new ArrayList<>();

        addList(list);
        System.out.println(list.size());



    }


    public static void addList(List<String> list){
//        list=new ArrayList<>();
        list.add("abc");
    }



}
