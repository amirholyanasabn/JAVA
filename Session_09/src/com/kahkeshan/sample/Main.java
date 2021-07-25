package com.kahkeshan.sample;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <7 ; i++) {
            for (int j = 0; j <7 ; j++) {
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String firstEl = ""+i;
                System.out.println(firstEl+j);

            }
        }
    }
}
