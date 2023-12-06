package org.example.exercices.TP_RoyaumeFantastique.factory.impl;

import org.example.exercices.TP_RoyaumeFantastique.entity.impl.ArcherArmement;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.ArcherAttribut;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.ArcherCompetence;
import org.example.exercices.TP_RoyaumeFantastique.factory.PersonnageFactory;

import java.util.ArrayList;

public class ArcherFactory extends PersonnageFactory {
    @Override
    public ArrayList<ArcherAttribut> createAttribut() {
        return new ArrayList<ArcherAttribut>();
    }
    @Override
    public ArcherArmement createArmement() {
        return new ArcherArmement();
    }
    @Override
    public ArrayList<ArcherCompetence> createCompetence() {
        return new ArrayList<ArcherCompetence>();
    }
}
