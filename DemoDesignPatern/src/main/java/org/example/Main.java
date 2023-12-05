package org.example;

import org.example.demo_builder.Voiture;

public class Main {
    public static void main(String[] args) {
        Voiture voiture = new Voiture.Builder()
                .marque("tesla")
                .model("3")
                .build();
        System.out.println(voiture);
        voiture = new Voiture.Builder()
                .marque("m1")
                .build();
        System.out.println(voiture);
    }
}