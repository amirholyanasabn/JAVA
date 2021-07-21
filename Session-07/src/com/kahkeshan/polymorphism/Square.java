package com.kahkeshan.polymorphism;

public class Square extends Shape{
    private int width;

    public Square(int width){
        this.width = width;
    }
    @Override
    public double getArea() {
        return width*width;
    }
}
