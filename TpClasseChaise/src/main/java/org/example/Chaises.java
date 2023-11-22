package org.example;

public class Chaises {

    private int nbPieds;
    private String couleur;
    private String materiaux;

    public Chaises() {
    }

    public Chaises(int nbPieds, String couleur, String materiaux) {
        this.nbPieds = nbPieds;
        this.couleur = couleur;
        this.materiaux = materiaux;
    }

    public int getNbPieds() {
        return nbPieds;
    }

    public void setNbPieds(int nbPieds) {
        this.nbPieds = nbPieds;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getMateriaux() {
        return materiaux;
    }

    public void setMateriaux(String materiaux) {
        this.materiaux = materiaux;
    }
}
