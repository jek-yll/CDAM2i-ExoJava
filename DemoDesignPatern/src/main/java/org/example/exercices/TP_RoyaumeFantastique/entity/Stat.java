package org.example.exercices.TP_RoyaumeFantastique.entity;

public class Stat extends Attribut{
    public String name;
    public int value;

    private Stat (Builder builder){
        this.name = builder.name;
        this.value = builder.value;
    }

    public static class Builder {
        private String name;
        private int value;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder value(int value){
            this.value = value;
            return this;
        }

        public Stat build(){ return new Stat(this); }
    }
}
