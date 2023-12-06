package org.example.exercices.TP_RoyaumeFantastique.factory.impl;

import org.example.exercices.TP_RoyaumeFantastique.entity.Fonctionnalite;
import org.example.exercices.TP_RoyaumeFantastique.entity.Style;
import org.example.exercices.TP_RoyaumeFantastique.entity.Taille;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.CaserneFonctionnalite;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.ForgeFonctionnalite;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.ForgeStyle;
import org.example.exercices.TP_RoyaumeFantastique.entity.impl.ForgeTaille;
import org.example.exercices.TP_RoyaumeFantastique.factory.BatimentFactory;

import java.util.ArrayList;

public class ForgeFactory extends BatimentFactory {
    @Override
    public Style createStyle() {
        return new ForgeStyle();
    }

    @Override
    public Taille createTaille() {
        return new ForgeTaille();
    }

    @Override
    public ArrayList<ForgeFonctionnalite> createFonctionnalites() {
        return new ArrayList<ForgeFonctionnalite>();
    }
}
