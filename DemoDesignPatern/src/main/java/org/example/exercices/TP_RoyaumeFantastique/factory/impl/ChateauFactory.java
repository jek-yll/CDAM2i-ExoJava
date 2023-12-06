package org.example.exercices.TP_RoyaumeFantastique.factory.impl;

import org.example.exercices.TP_RoyaumeFantastique.entity.Fonctionnalite;
import org.example.exercices.TP_RoyaumeFantastique.entity.Style;
import org.example.exercices.TP_RoyaumeFantastique.entity.Taille;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.CaserneFonctionnalite;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.ChateauFonctionnalite;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.ChateauStyle;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.ChateauTaille;
import org.example.exercices.TP_RoyaumeFantastique.factory.BatimentFactory;

import java.util.ArrayList;

public class ChateauFactory extends BatimentFactory {
    @Override
    public Style createStyle() {
        return new ChateauStyle();
    }

    @Override
    public Taille createTaille() {
        return new ChateauTaille();
    }

    @Override
    public ArrayList<ChateauFonctionnalite> createFonctionnalites() {
        return new ArrayList<ChateauFonctionnalite>();
    }
}
