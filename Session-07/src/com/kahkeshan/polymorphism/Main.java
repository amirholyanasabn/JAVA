package com.kahkeshan.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle(2);
        System.out.println(s.getArea());

        Circle x = (Circle) s;

        Shape s1 = new Square(2);
        System.out.println(s1.getArea());
    }
}
