package com.kahkeshan.person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Amirhossein",35);
        Person p2 = new Person("Amirhossein",35);
        System.out.println("name is : "+p1.toString());
        System.out.println("name is : "+p2.toString());
        System.out.println("Equal is : "+p1.equals(p2));
    }
}
