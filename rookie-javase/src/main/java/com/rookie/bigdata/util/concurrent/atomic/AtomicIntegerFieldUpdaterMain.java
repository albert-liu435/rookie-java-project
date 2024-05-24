package com.rookie.bigdata.util.concurrent.atomic;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * @Class AtomicIntegerFieldUpdaterMain
 * @Description https://juejin.cn/post/6907610980428021773
 * @Author rookie
 * @Date 2023/10/31 15:41
 * @Version 1.0
 */
public class AtomicIntegerFieldUpdaterMain {


    private volatile int a = 0;

    private static final AtomicIntegerFieldUpdater updater = AtomicIntegerFieldUpdater.newUpdater(AtomicIntegerFieldUpdaterMain.class, "a");

    @Test
    void testAtomicIntegerFieldUpdater(){
        AtomicIntegerFieldUpdaterMain atomicIntegerFieldUpdaterMain=new AtomicIntegerFieldUpdaterMain();

        for(int i=0;i<200;i++){
            final int j=i;
            Thread t=new Thread(()->{
                System.out.println("i="+j+",a="+updater.incrementAndGet(atomicIntegerFieldUpdaterMain));
            });
            t.start();
        }


    }



    @Test
    void tesGetAndIncrement(){
        Student student = new Student();
        //创建AtomicIntegerFieldUpdater对象
        AtomicIntegerFieldUpdater<Student> studentAtomicIntegerFieldUpdater = AtomicIntegerFieldUpdater.newUpdater(Student.class, "age");
        //打印age并将age+1
        //要修改的age必须是int不能是包装类Integer,必须被volatile修饰
        System.out.println(studentAtomicIntegerFieldUpdater.getAndIncrement(student));
        System.out.println(student.age);

        int i = studentAtomicIntegerFieldUpdater.get(student);

    }
}
