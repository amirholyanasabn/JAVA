package com.kahkeshan.polymorphism;

public class Circle extends Shape{
    private double radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius , String color){
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public boolean equals(Object obj) {
        Circle c;
        if(obj instanceof Circle){
            c = (Circle) obj;
        }else {
            return  false;
        }
        if(this.radius == c.radius && this.color == c.color){
            return true;
        }else
            return false;
    }
}
