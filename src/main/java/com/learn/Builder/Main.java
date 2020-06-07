package com.learn.Builder;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Director director = new Director(new HTMLBuilder());
        director.setFilename("我的一天.html");
        String filename = director.getFilename();
        System.out.println("已经生成文件 "+director.construct());
    }
}
