package com.kahkeshan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);
        list.add("Amir");
        list.add("Amir");
        list.add("Amir");
        list.add("Amir");
        list.add(new String("Neda"));
        list.add(3,"Sanam");
        list.set(1,"Sepideh");
        Collections.sort((list));

        Integer[] arr = {2,3,4,5,6};
        ArrayList<Integer> in = new ArrayList<>(Arrays.asList(arr));
        for(Integer item : in)
            System.out.println(item);
//        ArrayList<Integer> in = new ArrayList<>();
//        for(Integer item : arr)
//            in.add(item);
//        for(int i=0;i<in.size();i++)
//            System.out.println(in.get(i));

        for (String item: list) {
            System.out.println(item);
        }
    }
}
