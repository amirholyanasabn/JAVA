package com.kahkeshan.soccer;

public class Soccer {
    private String name;
    private String family;
    private int age;
    private String numberShirt;


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setFamily(String family){
        this.family = family;
    }
    public String getFamily(){
        return this.family;
    }

    public void setAge(int age){
        if (this.age < 0)
            this.age = 0;
        else
            this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void setNumberShirt(String numberShirt){
        this.numberShirt = numberShirt;
    }
    public String getNumberShirt(){
        return this.numberShirt;
    }

}
