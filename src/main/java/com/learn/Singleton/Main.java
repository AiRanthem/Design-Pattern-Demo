package com.learn.Singleton;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<UserThread> userThreads = new ArrayList<>();
        userThreads.add(new UserThread("人月神话.pdf"));
        userThreads.add(new UserThread("设计模式.pdf"));
        userThreads.add(new UserThread("c++ primer plus.pdf"));

        for (UserThread thread :
                userThreads) {
            System.out.println("New print job created: " + thread.getFilename());
            thread.start();
        }
    }
}
