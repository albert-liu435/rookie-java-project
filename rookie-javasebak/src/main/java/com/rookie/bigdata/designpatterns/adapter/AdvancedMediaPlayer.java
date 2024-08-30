package com.rookie.bigdata.designpatterns.adapter;

/**
 * @Class AdvancedMediaPlayer
 * @Description
 * @Author rookie
 * @Date 2023/5/6 15:27
 * @Version 1.0
 */
public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}
