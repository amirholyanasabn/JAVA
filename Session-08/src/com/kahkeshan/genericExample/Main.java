package com.kahkeshan.genericExample;

public class Main {
    public static <T extends Number> void print (T t){
        System.out.println(t);
    }
    public static void main(String[] args) {
        print(12.05);
        print(35);
        print(65);
//        print("amir");

    }
}
