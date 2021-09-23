package com.gucci.innerClass;

public class Main {
    public static void main(String[] args) {
        Student.StudentCard std = new Student().new StudentCard();
        std.f();
    }
}
