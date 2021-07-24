package com.kahkeshan;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Amirhossein",35);
        Person p2 = new Person("Gucci",6);
        Person p3 = new Person("Sepideh",33);
        Person p4 = new Person("Neda",35);
        Person[] people = {p1,p2,p3,p4};

//        Arrays.sort(people);
        Arrays.sort(people,new PersonComparator());
        System.out.println("finish");
    }
}
