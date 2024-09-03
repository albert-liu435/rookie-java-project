package com.rookie.bigdata.designpatterns.adapter;

/**
 * @Class Mp4Player
 * @Description
 * @Author rookie
 * @Date 2024/9/3 14:13
 * @Version 1.0
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
