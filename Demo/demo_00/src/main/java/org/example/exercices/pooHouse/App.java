package org.example.exercices.pooHouse;

public class App {

    public static void main(String[] args) {

        Apartment a1 = new Apartment(new Door("blue"));
        Person p1 = new Person("Thomas", a1);

        p1.display();

    }

}
