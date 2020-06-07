package com.learn.Builder;

import java.io.IOException;

public class Director {
    private final Builder builder;

    private String filename;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Object construct() throws IOException {
        builder.setFilename(filename);
        builder.makeTitle("Greeting");
        builder.makeString("从早上到白天结束");
        builder.makeItems(new String[]{
                "早安",
                "午安"
        });
        builder.makeString("到了晚上");
        builder.makeItems(new String[]{
                "晚安",
                "祝你有个好梦",
                "再见"
        });
        return builder.getResult();
    }
}
