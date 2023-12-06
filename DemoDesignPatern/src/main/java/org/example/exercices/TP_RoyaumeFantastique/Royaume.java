package org.example.exercices.TP_RoyaumeFantastique;

import org.example.exercices.TP_RoyaumeFantastique.entity.Batiment;
import org.example.exercices.TP_RoyaumeFantastique.entity.Personnage;

import java.util.ArrayList;
import java.util.List;

public class Royaume {
    private List<Batiment> batiments;
    private List<Personnage> personnages;

    private Royaume(Builder builder) {
        this.batiments = builder.batiments;
        this.personnages = builder.personnages;
    }

    public static class Builder {
        private List<Batiment> batiments = new ArrayList<>();
        private List<Personnage> personnages = new ArrayList<>();

        public Builder batiments(Batiment batiment){
            this.batiments.add(batiment);
            return this;
        };
        public Builder personnages(Personnage personnage){
            this.personnages.add(personnage);
            return this;
        };

        public Royaume build(){return new Royaume(this);}
    }
}
