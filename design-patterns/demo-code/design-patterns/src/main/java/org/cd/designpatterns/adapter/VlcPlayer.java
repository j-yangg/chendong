package org.cd.designpatterns.adapter;

/**
 * @classname: VlcPlayer
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-27 16:26
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
}

