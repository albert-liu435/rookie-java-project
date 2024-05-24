package com.rookie.bigdata.util.concurrent.atomic;

/**
 * @Class Student
 * @Description TODO
 * @Author rookie
 * @Date 2023/10/31 15:42
 * @Version 1.0
 */
public class Student {
    //因为是用反射实现的这里必须要使用public修饰
    public volatile int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
