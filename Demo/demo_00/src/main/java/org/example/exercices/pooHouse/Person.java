package org.example.exercices.pooHouse;

public class Person {

    private String name;
    private House house;

    public Person(String name, House house) {
        this.name = name;
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public void display(){
        System.out.printf("Je m'appelle %s\n", getName());
        house.display();
        house.getDoor().display();
    }
}
