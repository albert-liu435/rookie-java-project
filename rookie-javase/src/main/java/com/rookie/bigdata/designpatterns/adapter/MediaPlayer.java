package com.rookie.bigdata.designpatterns.adapter;

/**
 * @Class MediaPlayer
 * @Description https://blog.csdn.net/CB_Beginner/article/details/127254681
 * https://www.cnblogs.com/zy115/p/18137252
 * https://blog.csdn.net/TurboAnho/article/details/126348254
 * @Author rookie
 * @Date 2024/9/3 14:09
 * @Version 1.0
 */
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
