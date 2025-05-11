package com.rookie.bigdata.jvm.three.chapter03;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author rookie
 * @Description -Xms600m -Xmx600m -XX:SurvivorRatio=8
 * @Date 2025/4/29 7:30
 * @Version 1.0
 */
public class OOMTest {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Picture> list = new ArrayList<>();
        while (true) {
            Thread.sleep(50);

            list.add(new Picture(new Random().nextInt(100 * 50)));
        }
    }
}

class Picture {
    private String a = "hello picture";
    private byte[] pixels;


    public Picture(int size) {
        this.pixels = new byte[size];
    }
}
