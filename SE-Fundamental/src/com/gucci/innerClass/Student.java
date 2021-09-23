package com.gucci.innerClass;

public class Student {

    private String name;



    public class StudentCard{
        private String serial;

        public void f(){
            System.out.println(this.serial);
            System.out.println(Student.this.name);
        }
    }

    public void enterUniversity(){
        StudentCard studentCard = new StudentCard();
        studentCard.serial = "007810";
    }



}
