package com.gucci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter your name :");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name = reader.readLine();
            System.out.println("----------------");
            System.out.println("My name is " + name);
            System.out.println("Please enter your age : ");
            try {
                Integer age = Integer.valueOf(reader.readLine());
                age+=1;
                System.out.println("My age is " + age);
            }catch (Exception e){
                System.out.println("Exception Error type of age");
            }

        }catch (Exception e){
            System.out.println("Exception Reader");
        }
    }
}
