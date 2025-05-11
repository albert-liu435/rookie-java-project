package com.rookie.bigdata.juc.chapter03;

/**
 * @Author rookie
 * @Description
 * @Date 2025/5/11 15:37
 * @Version 1.0
 */
public class LockSyncDemo {

    Object object=new Object();
    public void m1(){
        synchronized (object){
            System.out.println("----- hello synchronized code block");
        }
    }

    public synchronized void m2(){
        System.out.println("----- hello synchronized method m2");
    }

    public synchronized static void m3(){
        System.out.println("----- hello synchronized method m3");
    }

    public static void main(String[] args) {

    }

}
