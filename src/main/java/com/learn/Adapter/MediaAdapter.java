package com.learn.Adapter;

public class MediaAdapter implements MediaPlayer {
    @Override
    public void play(String filename, String filetype) {
        switch (filetype) {
            case "mp3", "mp4" -> {
                // 转发给原生播放器播放
                MediaPlayerImpl mediaPlayer = new MediaPlayerImpl();
                mediaPlayer.play(filename, filetype);
            }
            case "flv" -> {
                // 使用腾讯视频播放flv
                TencentVideo tencentVideo = new TencentVideo();
                tencentVideo.playFlv(filename);
            }
            case "flac" -> {
                // 使用网易云音乐播放flac
                WangyiCloudMusic wangyiCloudMusic = new WangyiCloudMusic();
                wangyiCloudMusic.playFlac(filename);
            }
            default -> System.out.printf("\"%s\"的文件类型不支持\n", filename);
        }
    }
}
