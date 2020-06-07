package com.learn.Adapter;

public interface MediaPlayer {
    /**
     * 播放接口
     * @param filename 文件名
     * @param filetype 文件后缀名
     */
    void play(String filename, String filetype);
}
