package com.kahkeshan.comparable;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        Person p = (Person) o;
        if(this.name.equals(p.name) && this.age == p.age){
            return true;
        }else {
            return false;
        }
    }


    @Override
    public int compareTo(Person o) {
        ;
        if(this.age > o.age)
            return 1;
        else if(this.age<o.age)
            return -1;
        else
            return 0;
    }
}
