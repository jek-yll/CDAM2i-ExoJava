package org.example.exercices.pooPerson;

public class App {

    public static void main(String[] args) {

        Person p1 = new Person();
        Student s1 = new Student(15);
        Teacher t1 = new Teacher(40);
        p1.sayHello();
        s1.goToClasses();
        s1.sayHello();
        s1.displayAge();
        t1.sayHello();
        t1.displayAge();
        t1.explain();

    }
}
