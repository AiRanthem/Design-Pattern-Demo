package com.learn.Builder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLBuilder implements Builder {
    private StringBuffer bodyBuffer;
    private String title;
    private String filename;
    String template = "<!DOCTYPE html>" +
            "<html lang=\"en\">" +
            "<head>" +
            "<meta charset=\"UTF-8\">" +
            "<title>%s</title>" +       // make title here
            "</head>" +
            "<body>" + "%s" + // make body here
            "</body>" +
            "</html>";

    @Override
    public void makeTitle(String title) {
        this.title = title;
        bodyBuffer = new StringBuffer();
    }

    @Override
    public void makeString(String string) {
        bodyBuffer.append("<h3>").append(string).append("</h3>");
    }

    @Override
    public void makeItems(String[] items) {
        bodyBuffer.append("<ul>");
        for (String item :
                items) {
            bodyBuffer.append("<li>").append(item).append("</li>");
        }
        bodyBuffer.append("</ul>");
    }

    @Override
    public Object getResult() throws IOException {
        File file = new File(filename);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file.getName(), false);
        writer.write(String.format(template, title, bodyBuffer.toString()));
        writer.close();
        return file.getAbsolutePath();
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
