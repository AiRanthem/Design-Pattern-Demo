package com.learn.Singleton;

public class UserThread extends Thread {

    private final String filename;

    public String getFilename() {
        return filename;
    }

    public UserThread(String filename) {
        this.filename = filename;
    }

    @Override
    public void run() {
        PrinterDriver instance = PrinterDriver.getInstance();
        try {
            instance.print(filename);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
