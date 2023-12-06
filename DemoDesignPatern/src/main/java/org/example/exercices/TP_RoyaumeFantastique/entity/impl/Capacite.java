package org.example.exercices.TP_RoyaumeFantastique.entity.impl;

import org.example.exercices.TP_RoyaumeFantastique.entity.Competence;

public class Capacite extends Competence {

    private String name;
    private int cost;

    private Capacite(Builder builder){
        this.name = builder.name;
        this.cost = builder.cost;
    }

    public static class Builder {
        private String name;
        private int cost;

        public Builder name (String name){
            this.name = name;
            return this;
        };
        public Builder cost (int cost) {
            this.cost = cost;
            return this;
        };

        public Capacite build() { return new Capacite(this); }
    }

}
