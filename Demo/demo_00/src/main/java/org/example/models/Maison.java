package org.example.models;

import lombok.Data;

@Data
public class Maison {

    private final int id;
    private String ville;
    private int numero;
    private String adresse;

//    public Maison(String ville, int numero, String adresse) {
//        this.ville = ville;
//        this.numero = numero;
//        this.adresse = adresse;
//    }
}
