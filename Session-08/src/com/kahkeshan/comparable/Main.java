package com.kahkeshan.comparable;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Amirhossein",35);
        Person person2 = new Person("Neda",35);

        System.out.println(person1.equals(person2));
        System.out.println(person1.compareTo(person2));
    }
}
