package org.example.exercices.revisionJava;

import lombok.Data;

@Data
public class Lieu {
    private String name;
    private String adresse;
    private int capacity;

    public Lieu(String name, String adresse, int capacity) {
        this.name = name;
        this.adresse = adresse;
        this.capacity = capacity;
    }
}
