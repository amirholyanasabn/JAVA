package com.kahkeshan;

import com.kahkeshan.soccer.Coach;
import com.kahkeshan.soccer.Soccer;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setFamily("Doe");
        person.setAge(30);
        System.out.println("Name is => "+person.getName());
        System.out.println("Family is => "+person.getFamily());
        System.out.println("Age is => "+person.getAge());


        Soccer soccer = new Soccer();
        soccer.setName("Luis");
        soccer.setFamily("Figo");
        soccer.setAge(34);
        soccer.setNumberShirt("7");

        Coach coach = new Coach();
        coach.setName("Farhad");
        coach.setFamily("Majidi");
        coach.setAge(40);
        coach.setClub("Esteghlal");


        System.out.println(soccer.getName()+" "+soccer.getFamily()+" "+soccer.getAge()+" "+soccer.getNumberShirt());

        System.out.println(coach.getName()+" "+coach.getFamily()+" "+coach.getClub());
    }
}
