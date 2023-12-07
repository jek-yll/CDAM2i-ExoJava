package org.example.exercices.revision_simuZoo.builder;

import org.example.exercices.revision_simuZoo.entity.Animal;

public abstract class AnimalBuilder {
    public abstract AnimalBuilder name(String name);
    public abstract AnimalBuilder sexe(String sexe);
    public abstract AnimalBuilder age(int age);
    public abstract AnimalBuilder cry(String cry);
    public abstract AnimalBuilder color(String color);
    public abstract Animal build();
}
