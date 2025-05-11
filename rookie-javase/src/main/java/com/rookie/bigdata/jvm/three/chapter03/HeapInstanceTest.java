package com.rookie.bigdata.jvm.three.chapter03;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author rookie
 * @Description -Xms600m -Xmx600m -XX:SurvivorRatio=8
 * @Date 2025/4/29 7:07
 * @Version 1.0
 */
public class HeapInstanceTest {

    byte[] buffer=new byte[new Random().nextInt(1024*100)];

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(3000);

        ArrayList<HeapInstanceTest> list=new ArrayList<>();
        while (true){
            list.add(new HeapInstanceTest());

            Thread.sleep(100);

        }


    }
}
