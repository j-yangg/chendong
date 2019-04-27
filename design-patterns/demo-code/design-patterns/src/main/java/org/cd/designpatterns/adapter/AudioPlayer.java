package org.cd.designpatterns.adapter;

/**
 * @classname: AudioPlayer
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-27 16:31
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //播放mp3
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }
        //播放vlc或者mp4
        else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        //其他格式不支持
        else {
            System.out.println("Not supported given music file");
        }
    }
}
