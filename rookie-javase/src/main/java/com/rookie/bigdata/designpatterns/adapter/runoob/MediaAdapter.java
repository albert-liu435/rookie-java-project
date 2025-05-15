package com.rookie.bigdata.designpatterns.adapter.runoob;

/**
 * @Class MediaAdapter
 * @Description https://blog.csdn.net/TurboAnho/article/details/126348254
 * <p>
 * 把一个类的接口变换成客户端所期待的另一个接口，从而使因原本接口不匹配而无法在一起工作的两个类能够在一起工作。
 * @Author rookie
 * @Date 2023/5/6 15:46
 * @Version 1.0
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
