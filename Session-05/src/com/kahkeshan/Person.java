package com.kahkeshan;

public class Person {
    private String name;
    private String family;
    private int age;

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFamily(){
        return this.family;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name =name;
    }

}
