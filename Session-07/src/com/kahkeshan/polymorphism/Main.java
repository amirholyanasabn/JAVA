package com.kahkeshan.polymorphism;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(14,"Red");
        Circle c2 = new Circle(14,"Red");

        if (c1.equals(c2)){
            System.out.println("True");
        }

        String s1 = new String("JAVA");
        String s2 = new String("JAVA");
        if(s1.equals(s2)){
            System.out.println(true);
        }
//        Shape s = new Circle(2);
//
//        System.out.println(s.getArea());
//
//        Circle x = (Circle) s;
//
//        Shape s1 = new Square(2);
//        System.out.println(s1.getArea());
    }
}
