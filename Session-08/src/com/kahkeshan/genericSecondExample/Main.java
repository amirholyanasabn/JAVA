package com.kahkeshan.genericSecondExample;

import java.util.Scanner;

public class Main {
    public static <T extends Number> void print(T[] ts){
        for (int i = 0; i <ts.length ; i++) {
            System.out.println(ts[i]);
        }
    }
    public static void main(String[] args) {
      Integer[] numbers= {65,35,86,9,11};
      print(numbers);
      Float[] nums = {12.25f,25.65f};
      print(nums);
    }
}
