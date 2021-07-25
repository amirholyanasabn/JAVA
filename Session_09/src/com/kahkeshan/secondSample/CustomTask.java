package com.kahkeshan.secondSample;

public class CustomTask implements Runnable {
    public static String data = "$";
    public  boolean flag = false;
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            if (flag)
                break;
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(data);
//            if (!data.equals("$"))
//                break;
        }
    }
}
