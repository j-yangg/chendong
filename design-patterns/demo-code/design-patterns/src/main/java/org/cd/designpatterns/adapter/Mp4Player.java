package org.cd.designpatterns.adapter;

/**
 * @classname: Mp4Player
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-27 16:27
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

