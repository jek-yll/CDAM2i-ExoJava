package org.example.exercices.TP_RoyaumeFantastique.factory;

import org.example.exercices.TP_RoyaumeFantastique.entity.Fonctionnalite;
import org.example.exercices.TP_RoyaumeFantastique.entity.Style;
import org.example.exercices.TP_RoyaumeFantastique.entity.Taille;

import java.util.ArrayList;

public abstract class BatimentFactory {
    public abstract Style createStyle();
    public abstract Taille createTaille();
    public abstract ArrayList<? extends Fonctionnalite> createFonctionnalites();

}
