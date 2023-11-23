package org.example.exercices.pooChaise;

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

    public void display(){
        System.out.println("-------------------------- Affichage d'un nouvel objet --------------------------\n");
        System.out.printf("Je suis une Chaise, avec %d pieds en %s et de couleur %s",nbPieds,materiaux,couleur );
        System.out.println("\n\n---------------------------------------------------------------------------------");
    }
}
