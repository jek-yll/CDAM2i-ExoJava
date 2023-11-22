package org.example;

public class Main {

    public static void main(String[] args) {


        Chaises chaise1 = new Chaises(4,"Bleu", "Bois");

        System.out.println("-------------------------- Affichage d'un nouvel objet --------------------------\n");
        System.out.printf("Je suis une Chaise, avec %d pieds en %s et de couleur %s",chaise1.getNbPieds(),chaise1.getMateriaux(),chaise1.getCouleur() );
        System.out.println("\n\n---------------------------------------------------------------------------------");
    }
}