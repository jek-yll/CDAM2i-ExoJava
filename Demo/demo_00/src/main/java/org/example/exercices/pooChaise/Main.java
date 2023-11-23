package org.example.exercices.pooChaise;

public class Main {

    public static void main(String[] args) {

        Chaises chaise1 = new Chaises(4,"Bleu", "Bois");
        Chaises chaise2 = new Chaises(5, "vert", "brique");
        Chaises chaise3 = new Chaises(1, "marron", "carton");

        chaise1.display();
        chaise2.display();
        chaise3.display();

    }
}