package org.example.models;

import org.example.exercices.Stationery.Pen;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(2);
        Person person1 = new Person();
        Person person2 = new Person(3, "Jean", "Michel");

        person1.setId(1);

        person.setFirstname("toto");
        person.setLastname("tata");

        person1.setFirstname("toto");
        person1.setLastname("tata");


        System.out.println(person.getId());
        System.out.println(person);
        System.out.println(person1);

        System.out.println(person.equals(person1));

        Maison maison = new Maison(19);


    }
}
