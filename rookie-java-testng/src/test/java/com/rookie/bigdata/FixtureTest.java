package com.rookie.bigdata;

import org.testng.annotations.*;

/**
 * @Class FixtureTest
 * @Description https://www.itest.info/episodes/406
 * @Author rookie
 * @Date 2024/6/13 15:10
 * @Version 1.0
 */
public class FixtureTest {


    //
//    注解	说明
//    @BeforeSuite	注解的方法在测试套件（中的所有用例）开始前运行一次
//    @AfterSuite	注解的方法在测试套件（中的所有用例）结束后运行一次。
//    @BeforeClass	注解的方法在当前测试类（中所有用例）开始前运行一次。
//    @AfterClass	注解的方法在当前测试类（中所有用例）结束后运行一次。
//    @BeforeTest	对于套件测试，在运行属于标签内的类的所有测试方法之前运行。
//    @AfterTest	对于套件测试，在运行属于标签内的类的所有测试方法之后运行。
//    @BeforeGroups	在调用属于该组的所有测试方法之前运行。
//    @AfterGroups	在调用属于该组的所有测试方法之后运行。
//    @BeforeMethod	注解的方法将在每个测试方法之前运行。
//    @AfterMethod	注释的方法将在每个测试方法之后执行。


    //在当前测试类开始时运行。
    @BeforeClass
    public static void beforeClass(){
        System.out.println("-------------------beforeClass");
    }

    //在当前测试类结束时运行。
    @AfterClass
    public static void afterClass(){
        System.out.println("-------------------afterClass");
    }

    //每个测试方法运行之前运行
    @BeforeMethod
    public void before(){
        System.out.println("=====beforeMethod");
    }

    //每个测试方法运行之后运行
    @AfterMethod
    public void after(){
        System.out.println("=====afterMethod");
    }

    @Test
    public void testCase1(){
        System.out.println("test case 1");
    }

    @Test
    public void testCase2(){
        System.out.println("test case 2");
    }







}
