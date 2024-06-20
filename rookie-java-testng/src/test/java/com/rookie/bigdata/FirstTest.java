package com.rookie.bigdata;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @Class FirstTest
 * @Description https://www.itest.info/episodes/405
 * @Author rookie
 * @Date 2024/6/13 15:06
 * @Version 1.0
 */
public class FirstTest {


    @Test
    public void testCase() {
        assertEquals(2 + 2, 4);
//        AssertJUnit.assertEquals(3+3,7);
    }
}
