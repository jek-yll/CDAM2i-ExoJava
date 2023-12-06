package org.example.exercices.TP_RoyaumeFantastique.factory.impl;

import org.example.exercices.TP_RoyaumeFantastique.entity.impl.GuerrierAttribut;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.GuerrierCompetence;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.GuierrierArmement;
import org.example.exercices.TP_RoyaumeFantastique.factory.PersonnageFactory;

import java.util.ArrayList;

public class GuerrierFactory extends PersonnageFactory {
    @Override
    public ArrayList<GuerrierAttribut> createAttribut() {
        return new ArrayList<GuerrierAttribut>();
    }

    @Override
    public GuierrierArmement createArmement() {
        return new GuierrierArmement();
    }

    @Override
    public ArrayList<GuerrierCompetence> createCompetence() {
        return new ArrayList<GuerrierCompetence>();
    }
}
