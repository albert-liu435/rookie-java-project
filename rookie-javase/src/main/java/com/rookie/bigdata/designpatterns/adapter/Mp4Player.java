package com.rookie.bigdata.designpatterns.adapter;

/**
 * @Class Mp4Player
 * @Description
 * @Author rookie
 * @Date 2023/5/6 15:28
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
