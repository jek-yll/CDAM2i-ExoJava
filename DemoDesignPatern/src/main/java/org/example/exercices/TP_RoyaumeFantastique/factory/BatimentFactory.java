package org.example.exercices.TP_RoyaumeFantastique.factory;

import org.example.exercices.TP_RoyaumeFantastique.entity.Fonctionnalite;
import org.example.exercices.TP_RoyaumeFantastique.entity.Style;
import org.example.exercices.TP_RoyaumeFantastique.entity.Taille;

import java.util.List;

public abstract class BatimentFactory {

    public abstract Style createStyle();
    public abstract Taille createTaille();
    public abstract List<Fonctionnalite> createFonctionnalites();

}
