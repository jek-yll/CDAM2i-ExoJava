package org.example.exercices.pooPerson;

public class Teacher extends Person {

    private String subject;

    public Teacher(int age) {
        super(age);
    }

    public void explain(){
        System.out.println("Explanation begins");
    }
}
