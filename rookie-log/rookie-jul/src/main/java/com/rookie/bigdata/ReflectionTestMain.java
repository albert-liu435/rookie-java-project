package com.rookie.bigdata;

import sun.reflect.Reflection;

import java.util.Calendar;
import java.util.Date;

/**
 * @Class ReflectionTestMain
 * @Description
 * @Author rookie
 * @Date 2024/6/20 17:37
 * @Version 1.0
 */
public class ReflectionTestMain {

    public static void main(String[] args) {
        //传入0的时候获取的是Reflection本身,但是无法获取里面的字段
        //当传入1获取的被调用类的class
        //当传入2的时候调用的是调用类的class
        Class<?> callerClass = Reflection.getCallerClass(1);
        String s = callerClass.toString();
        System.out.println(s);


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
//        account.setStartDate(calendar.getTime());
        calendar.add(Calendar.YEAR, 1);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(calendar.getTime());




    }
}
