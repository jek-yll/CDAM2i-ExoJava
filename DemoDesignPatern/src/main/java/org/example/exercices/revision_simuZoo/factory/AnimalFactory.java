package org.example.exercices.revision_simuZoo.factory;

import org.example.exercices.revision_simuZoo.builder.AnimalBuilder;
import org.example.exercices.revision_simuZoo.entity.Animal;

public abstract class AnimalFactory {

    abstract Animal createAnimal(AnimalBuilder builder);

}
