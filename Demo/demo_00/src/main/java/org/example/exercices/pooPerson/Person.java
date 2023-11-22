package org.example.exercices.pooPerson;

public class Person {

    private int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    public void displayAge(){
        System.out.printf("Ma age is : %d years old" + "\n",getAge() );
    }
}
