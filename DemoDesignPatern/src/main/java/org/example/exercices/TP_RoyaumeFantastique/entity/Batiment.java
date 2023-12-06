package org.example.exercices.TP_RoyaumeFantastique.entity;

import lombok.Builder;
import org.example.exercices.TP_RoyaumeFantastique.factory.BatimentFactory;

import java.util.List;

public class Batiment {
    private Style style;
    private Taille taille;
    private List<Fonctionnalite> fonctionnalites;
    private BatimentFactory batimentFactory;

    public Batiment(BatimentFactory batimentFactory){
        setBatimentFactory(batimentFactory);
    }

    public void setBatimentFactory(BatimentFactory batimentFactory){
        this.batimentFactory = batimentFactory;
        style = this.batimentFactory.createStyle();
        taille = this.batimentFactory.createTaille();
        fonctionnalites = (List<Fonctionnalite>) this.batimentFactory.createFonctionnalites();

    }

}
