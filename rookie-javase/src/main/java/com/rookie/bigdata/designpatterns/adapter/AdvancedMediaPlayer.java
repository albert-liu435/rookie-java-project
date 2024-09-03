package com.rookie.bigdata.designpatterns.adapter;

/**
 * @Class AdvancedMediaPlayer
 * @Description
 * @Author rookie
 * @Date 2024/9/3 14:10
 * @Version 1.0
 */
public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}
