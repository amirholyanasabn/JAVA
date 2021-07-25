package com.kahkeshan.secondSample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomTask task = new CustomTask();
        Thread thread = new Thread(task);
        thread.start();

        Scanner scan = new Scanner(System.in);

        String input = scan.next();

//        CustomTask.data = input;
        task.flag = true;

        System.out.println("Finish");
    }
}
