package org.example.exercices.TP_RoyaumeFantastique.factory.impl;

import org.example.exercices.TP_RoyaumeFantastique.entity.Fonctionnalite;
import org.example.exercices.TP_RoyaumeFantastique.entity.Style;
import org.example.exercices.TP_RoyaumeFantastique.entity.Taille;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.ChateauStyle;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.ChateauTaille;
import org.example.exercices.TP_RoyaumeFantastique.factory.BatimentFactory;

import java.util.ArrayList;
import java.util.List;

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
    public List<Fonctionnalite> createFonctionnalites() {
        return new ArrayList<Fonctionnalite>();
    }
}
