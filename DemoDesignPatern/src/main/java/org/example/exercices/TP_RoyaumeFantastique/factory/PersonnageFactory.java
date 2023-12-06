package org.example.exercices.TP_RoyaumeFantastique.factory;

import org.example.exercices.TP_RoyaumeFantastique.entity.Armement;
import org.example.exercices.TP_RoyaumeFantastique.entity.Attribut;
import org.example.exercices.TP_RoyaumeFantastique.entity.Competence;

import java.util.ArrayList;

public abstract class PersonnageFactory {

    public abstract ArrayList<? extends Attribut> createAttribut();
    public abstract Armement createArmement();
    public abstract ArrayList<? extends Competence> createCompetence();
}
