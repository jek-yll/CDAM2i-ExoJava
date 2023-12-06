package org.example.exercices.TP_RoyaumeFantastique.entity;

import org.example.exercices.TP_RoyaumeFantastique.factory.PersonnageFactory;

import java.util.List;

public class Personnage {
    private Armement armement;
    private List<Attribut> attributs;
    private List<Competence> competences;

    private PersonnageFactory personnageFactory;

    public Personnage(PersonnageFactory personnageFactory){
        setPersonnageFactory(personnageFactory);
    }

    public void setPersonnageFactory(PersonnageFactory personnageFactory){
        this.personnageFactory = personnageFactory;
        armement = this.personnageFactory.createArmement();
        attributs = (List<Attribut>) this.personnageFactory.createAttribut();
        competences = (List<Competence>) this.personnageFactory.createCompetence();
    }

    public void setArmement(Armement armement){
        this.armement = armement;
    }

    public void addAttributs(Attribut attribut){
        this.attributs.add(attribut);
    }

}
