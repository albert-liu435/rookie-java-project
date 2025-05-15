package com.rookie.bigdata.designpatterns.adapter.runoob;

/**
 * @Class Demo
 * @Description https://www.runoob.com/design-pattern/adapter-pattern.html
 * @Author rookie
 * @Date 2025/5/14 15:05
 * @Version 1.0
 */
public class Demo {


//    void play() {

    public static void main(String[] args) {


        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

}
