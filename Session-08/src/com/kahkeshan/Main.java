package com.kahkeshan;

import java.util.Scanner;

public class Main {
    public static int getYear(String str){
          String[] date = str.split("/");
          int year = Integer.parseInt(date[0]);
          return year;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your date : ");
        try {
            String input = scanner.next(); //1400/04/31
            System.out.println(getYear(input));
        }catch (Exception e){
            System.out.println("Bad Input");
        }

    }
}
