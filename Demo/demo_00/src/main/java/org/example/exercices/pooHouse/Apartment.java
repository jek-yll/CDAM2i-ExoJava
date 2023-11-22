package org.example.exercices.pooHouse;

public class Apartment extends House{

    public Apartment( Door door) {
        super(50, door);
    }

    public void display(){
        System.out.printf("J'ai un appartement, d'une surface de %d m² \n",getSurface());
    }
}
