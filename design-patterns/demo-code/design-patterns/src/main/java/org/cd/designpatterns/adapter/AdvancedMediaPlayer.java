package org.cd.designpatterns.adapter;

/**
 * @classname: AdvancedMediaPlayer
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-27 16:25
 */
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}

