package org.example.exercices.TP_RoyaumeFantastique.entity;


public class Arme extends Armement{
    private String name;
    private int durability;
    private int hand;

    private Arme(Builder builder){
        this.name = builder.name;
        this.durability = builder.durability;
        this.hand = builder.hand;
    }

    public static class Builder {
        private String name;
        private int durability;
        private int hand;

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder hand(int hand){
            this.hand = hand;
            return this;
        }
        public Builder durability(int durability){
            this.durability = durability;
            return this;
        }

        public Arme build(){return new Arme( this );}
    }
}
