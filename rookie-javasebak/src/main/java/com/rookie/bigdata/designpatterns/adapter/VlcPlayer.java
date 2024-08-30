package com.rookie.bigdata.designpatterns.adapter;

/**
 * @Class VlcPlayer
 * @Description
 * @Author rookie
 * @Date 2023/5/6 15:27
 * @Version 1.0
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
