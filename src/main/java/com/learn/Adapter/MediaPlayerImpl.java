package com.learn.Adapter;

public class MediaPlayerImpl implements MediaPlayer {
    @Override
    public void play(String filename, String filetype) {
        System.out.printf("文件播放中: %s\n", filename);
    }
}
