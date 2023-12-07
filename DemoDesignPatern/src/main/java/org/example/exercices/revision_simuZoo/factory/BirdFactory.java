package org.example.exercices.revision_simuZoo.factory;

import org.example.exercices.revision_simuZoo.builder.AnimalBuilder;
import org.example.exercices.revision_simuZoo.entity.Animal;

public class BirdFactory extends AnimalFactory{
    @Override
    Animal createAnimal(AnimalBuilder builder) {
        return builder.build();
    }
}
