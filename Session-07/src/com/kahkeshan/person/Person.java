package com.kahkeshan.person;

public class Person {
    private String name;
    private int age;

//    public Person(){
//        //default ctor
//    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        Person p ;
        if(obj instanceof Person)
            p = (Person) obj;
        else
            return false;
        if(this.name.equals(p.name) && this.age == p.age)
            return true;
        else
            return false;
    }
}
