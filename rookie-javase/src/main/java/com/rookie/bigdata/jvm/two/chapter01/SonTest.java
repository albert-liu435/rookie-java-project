package com.rookie.bigdata.jvm.two.chapter01;

/**
 * @Author rookie
 * @Description
 * @Date 2025/4/23 23:49
 * @Version 1.0
 */
public class SonTest {

    public static void main(String[] args) {

        Father father=new Son();
        System.out.println(father.x);
    }
}

class Father{
    int x=10;
    public Father(){
        this.print();
        x=20;
    }
    public void print(){
        System.out.println("Father.x="+x);
    }
}

class Son extends Father{
    int x=30;

    public Son(){
        this.print();
        x=40;
    }

    public void print(){

        System.out.println("Son.x="+x);
    }
}
