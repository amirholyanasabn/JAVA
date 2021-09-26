package com.gucci.exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter date : ");
        try {
            String inputDate = scanner.next();
            int year = DateOfUser.getYear(inputDate);
            System.out.println(year);

        }catch (CustomException e){
            System.out.println(e.getMessage());
        }


        System.out.println("This is finish");
    }
}
