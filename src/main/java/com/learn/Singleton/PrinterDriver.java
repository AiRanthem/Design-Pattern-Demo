package com.learn.Singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrinterDriver {
    private static final PrinterDriver instance = new PrinterDriver();

    public static PrinterDriver getInstance() {
        return instance;
    }

    private PrinterDriver(){ }

    synchronized
    public void print(String string) throws InterruptedException {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        String start = sdf.format(new Date());
        System.out.printf("\nPrinting %s ...       time: %s\n", string, start);
        Thread.sleep(2000);
        String end = sdf.format(new Date());
        System.out.printf("Print %s  done!       time: %s\n", string, end);
    }
}
