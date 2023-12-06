package org.example.exercices.builder_pizza;

import java.util.ArrayList;

public class Pizza {
    private String taille;
    private String pate;
    private String fromage;
    private ArrayList<String> garnitures;
    private String sauce;

    private Pizza(Builder builder){
        this.taille = builder.taille;
        this.pate = builder.pate;
        this.fromage = builder.fromage;
        this.garnitures = builder.garnitures;
        this.sauce = builder.sauce;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "taille='" + taille + '\'' +
                ", pate='" + pate + '\'' +
                ", fromage='" + fromage + '\'' +
                ", garnitures=" + garnitures +
                ", sauce='" + sauce + '\'' +
                '}';
    }

    public static class Builder{
        private String taille;
        private String pate;
        private String fromage ;
        private ArrayList<String> garnitures = new ArrayList<>();
        private String sauce;
        public Builder taille(String taille){
            this.taille = taille;
            return this;
        }
        public Builder pate(String pate){
            this.pate = pate;
            return this;
        }
        public Builder fromage(String fromage){
            if (this.fromage != null){
                throw new RuntimeException("Un fromage a deja etait choisi");
            }
            this.fromage = fromage;
            return this;
        }
        public Builder garnitures(String garniture){
            this.garnitures.add(garniture);
            return this;
        }

        public Pizza build(){return new Pizza(this);}
    }
}
