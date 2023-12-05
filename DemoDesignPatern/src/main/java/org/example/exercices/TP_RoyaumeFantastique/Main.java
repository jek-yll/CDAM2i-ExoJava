package org.example.exercices.TP_RoyaumeFantastique;

import org.example.exercices.TP_RoyaumeFantastique.entity.Batiment;
import org.example.exercices.TP_RoyaumeFantastique.factory.impl.CaserneFactory;

public class Main {
    public static void main(String[] args) {
        Batiment batiment1 = new Batiment(new CaserneFactory());
        System.out.println(batiment1);
    }
}
