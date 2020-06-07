package com.learn.Adapter;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter();
        player.play("两只老虎.mp3","mp3");
        player.play("太极拳.mp4","mp4");
        player.play("国际歌.flac","flac");
        player.play("复仇者联盟.flv","flv");
        player.play("神秘视频.avg","avg");
    }
}
