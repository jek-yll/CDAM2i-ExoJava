package org.example.collections;

import java.util.Vector;

public class DemoCollections {
    public static void main(String[] args) {
        //Vector
        Vector<String> victor = new Vector<>();
        victor.add("Pomme");
        victor.add("Banane");
        victor.add("Orange");
        System.out.println(victor);

        //Méthode pour le vectore
        System.out.println("1. Taille du vector: " + victor.size());
        System.out.println("2. Element à l'index 1 du vector: " + victor.get(1));
        System.out.println("1. Est ce que Apple est présent dans le vector: " + victor.contains("Apple"));
    }
}
