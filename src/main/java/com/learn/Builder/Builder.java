package com.learn.Builder;

import java.io.IOException;

public interface Builder {
    void makeTitle(String title);
    void makeString(String string);
    void makeItems(String[] items);
    Object getResult() throws IOException;
    void setFilename(String filename);
}
