package org.example.exercices.TP_RoyaumeFantastique.factory.impl;

import org.example.exercices.TP_RoyaumeFantastique.entity.Armement;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.MageArmement;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.MageAttribut;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.MageCompetence;
import org.example.exercices.TP_RoyaumeFantastique.factory.PersonnageFactory;

import java.util.ArrayList;

public class MageFactory extends PersonnageFactory {

    @Override
    public ArrayList<MageAttribut> createAttribut() {
        return new ArrayList<MageAttribut>();
    }

    @Override
    public Armement createArmement() {
        return new MageArmement() ;
    }

    @Override
    public ArrayList<MageCompetence> createCompetence() {
        return new ArrayList<MageCompetence>();
    }
}
