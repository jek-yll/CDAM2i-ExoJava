package org.example.exercices.TP_RoyaumeFantastique.factory.impl;

import org.example.exercices.TP_RoyaumeFantastique.entity.impl.GuerrierAttribut;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.GuerrierCompetence;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.GuerrierArmement;
import org.example.exercices.TP_RoyaumeFantastique.factory.PersonnageFactory;

import java.util.ArrayList;

public class GuerrierFactory extends PersonnageFactory {
    @Override
    public ArrayList<GuerrierAttribut> createAttribut() {
        return new ArrayList<GuerrierAttribut>();
    }

    @Override
    public GuerrierArmement createArmement() {
        return new GuerrierArmement();
    }

    @Override
    public ArrayList<GuerrierCompetence> createCompetence() {
        return new ArrayList<GuerrierCompetence>();
    }
}
