package org.example.exercices.revision_simuZoo.builder;

import org.example.exercices.revision_simuZoo.entity.Animal;

public class BirdBuilder extends AnimalBuilder{
    private String name;
    private String sexe;
    private int age;
    private String cry;
    private String color;

    @Override
    public AnimalBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public AnimalBuilder sexe(String sexe) {
        this.sexe = sexe;
        return this;
    }

    @Override
    public AnimalBuilder age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public AnimalBuilder cry(String cry) {
        this.cry = cry;
        return this;
    }

    public AnimalBuilder color(String color){
        this.color = color;
        return this;
    }

    @Override
    public Animal build() {
        return null;
    }

    public String getName() {
        return name;
    }

    public String getSexe() {
        return sexe;
    }

    public int getAge() {
        return age;
    }

    public String getCry() {
        return cry;
    }

    public String getColor() {
        return color;
    }
}
