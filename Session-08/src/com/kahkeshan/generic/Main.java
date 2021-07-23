package com.kahkeshan.generic;

import java.io.Serializable;

public class Main {
    public static <E extends CharSequence , F extends Number> F print(E i,F f){
        System.out.println(i);
        return f;
    }
//    public static void print(int num){
//        System.out.println(num);
//    }
//    public static void print(String name){
//        System.out.println(name);
//    }
    public static void main(String[] args) {
        print("John",35);
//        print(12);
//        print(19.98);
//        print("Amir");
    }
}
