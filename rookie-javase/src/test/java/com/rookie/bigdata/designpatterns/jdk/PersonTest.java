package com.rookie.bigdata.designpatterns.jdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class PersonTest
 * @Description
 * @Author rookie
 * @Date 2024/1/25 11:05
 * @Version 1.0
 */
class PersonTest {



    @Test
    void test01(){
        // 1.通过类实例获取
        Person person = new Person();
        Class<? extends Person> clazz1 = person.getClass();
        System.out.println("01 - " + clazz1);

        // 2.通过类直接调用class获取
        Class<Person> clazz2 = Person.class;
        System.out.println("02 - " + clazz2);

        // 3.通过Class.forName获取
        Class<?> clazz3 = null;
        try {
            clazz3 = Class.forName("com.rookie.bigdata.designpatterns.jdk.Person");
        } catch (ClassNotFoundException e) {
            // 当找不到指定类时，会抛出此异常
            e.printStackTrace();
        }
        System.out.println("03 - " + clazz3);

        // 4.通过类加载器获取
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?> clazz4 = null;
        try {
            clazz4 = classLoader.loadClass("com.rookie.bigdata.designpatterns.jdk.Person");
        } catch (ClassNotFoundException e) {
            // 当找不到指定类时，会抛出此异常
            e.printStackTrace();
        }
        System.out.println("04 - " + clazz4);

        //通过上面的输出结果可以看出，这四个Class对象的hashCode相同，说明使用这四种方式获取的是同一个对象。
        // hashCode相等，说明这四种方式获取的是同一个实例
        System.out.println("05 - " + clazz1.hashCode());
        System.out.println("06 - " + clazz2.hashCode());
        System.out.println("07 - " + clazz3.hashCode());
        System.out.println("08 - " + clazz4.hashCode());
    }




}
