package com.kahkeshan.soccer;

import com.kahkeshan.Person;

public class Coach extends Person {

    private String club;

    public void setClub(String club){
        this.club = club;
    }
    public String getClub(){
        return this.club;
    }
}
