package com.gucci.exceptionHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter date : ");
        String date = scan.next();
        try {
            Date.getYear(date);
        }catch (MyException e){
            System.err.println(e.getMessage());
        }
    }
}
