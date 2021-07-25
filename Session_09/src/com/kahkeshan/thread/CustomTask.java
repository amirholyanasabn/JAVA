package com.kahkeshan.thread;

public class CustomTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <1_000_000_000 ; i++) {
            System.out.println("$");
        }
    }
}
