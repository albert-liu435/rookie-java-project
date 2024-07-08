package com.rookie.bigdata.generic.generic1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class GenericListTest
 * @Description
 * @Author rookie
 * @Date 2024/7/4 16:20
 * @Version 1.0
 */
class GenericListTest {


    @Test
    void test01() {
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((String) list.get(i));
        }
    }


}
