package com.kahkeshan.thread;

public class Main {
    public static void main(String[] args) {
        CustomTask customTask = new CustomTask();
        Thread thread = new Thread(customTask);
        thread.start();
        for (int i = 0; i <1_000_000_000 ; i++) {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("*");
        }

    }
}
