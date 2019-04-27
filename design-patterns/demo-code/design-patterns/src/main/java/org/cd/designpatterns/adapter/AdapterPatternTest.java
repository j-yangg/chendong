package org.cd.designpatterns.adapter;

/**
 * @classname: AdapterPatternTest
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-27 16:35
 */
public class AdapterPatternTest {
    public static void main(String[] args) {
        MediaPlayer player = new AudioPlayer();
        player.play("mp3", "i miss u.mp3");
        player.play("vlc", "i like u.vlc");
        player.play("mp4", "i love u.mp4");
        player.play("avi", "i hate u.avi");
    }
}
