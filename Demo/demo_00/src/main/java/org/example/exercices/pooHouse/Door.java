package org.example.exercices.pooHouse;

public class Door {

    private String color;

    public Door(){

    }

    public Door(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display(){

        System.out.printf("Je suis une porte, ma couleur %s \n",color);
    }
}
