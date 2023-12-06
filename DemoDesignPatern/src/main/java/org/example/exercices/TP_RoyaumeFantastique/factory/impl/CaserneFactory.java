package org.example.exercices.TP_RoyaumeFantastique.factory.impl;

import org.example.exercices.TP_RoyaumeFantastique.entity.Fonctionnalite;
import org.example.exercices.TP_RoyaumeFantastique.entity.Style;
import org.example.exercices.TP_RoyaumeFantastique.entity.Taille;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.CaserneFonctionnalite;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.CaserneStyle;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.CaserneTaille;
import org.example.exercices.TP_RoyaumeFantastique.factory.BatimentFactory;

import java.util.ArrayList;

public class CaserneFactory extends BatimentFactory {
    @Override
    public Style createStyle() {
        return new CaserneStyle();
    }

    @Override
    public Taille createTaille() {
        return new CaserneTaille();
    }

    @Override
    public ArrayList<CaserneFonctionnalite> createFonctionnalites() {
        return new ArrayList<CaserneFonctionnalite>();
    }

}
