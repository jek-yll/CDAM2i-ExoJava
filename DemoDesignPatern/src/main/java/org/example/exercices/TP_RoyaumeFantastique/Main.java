package org.example.exercices.TP_RoyaumeFantastique;

import org.example.demo_builder.Voiture;
import org.example.exercices.TP_RoyaumeFantastique.entity.Batiment;
import org.example.exercices.TP_RoyaumeFantastique.entity.Personnage;
import org.example.exercices.TP_RoyaumeFantastique.factory.impl.*;

public class Main {
    public static void main(String[] args) {
        Batiment caserne = new Batiment(new CaserneFactory());
        //System.out.println(caserne);
        Batiment forge = new Batiment(new ForgeFactory());
        Batiment chateau = new Batiment(new ChateauFactory());

        Personnage magicien = new Personnage(new MageFactory());
        //System.out.println(magicien);
        Personnage guerrier = new Personnage(new GuerrierFactory());
        Personnage archer = new Personnage(new ArcherFactory());

        Royaume r1 = new Royaume.Builder()
                .batiments(caserne)
                .batiments(caserne)
                .batiments(forge)
                .batiments(chateau)
                .personnages(magicien)
                .personnages(archer)
                .personnages(guerrier)
                .build();

        System.out.println(r1);

    }
}
