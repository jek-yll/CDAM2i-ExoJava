package org.example.exercice;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice {

    public static void getExercice2_2() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer un nombre");
        Integer nbr = scanner.nextInt();
        System.out.println("votre nombre au carré : " + nbr*nbr);

    }

    public static void getExercice2_3() {

        Scanner scanner= new Scanner((System.in));
        System.out.println("Quel est votre prénom : ");
        String prenom = scanner.next();
        System.out.println("Bonjour, " + prenom + " !");
    }

    public static void getExercice2_4() {
        Scanner scanner= new Scanner((System.in));
        System.out.println("Veuillez entrer un prix HT (en €)");
        float prixHt = scanner.nextFloat();
        System.out.println("Combien d'articles avez vous ?");
        float nbArticle = scanner.nextFloat();
        System.out.println("Quel est le taux de la TVA (en %)");
        float tva = scanner.nextFloat();

        System.out.println("Prix hors taxes (en €) : " + prixHt +
                "\n nombres d'articles : " + nbArticle +
                "\n TVA (en %) : " + tva +
                "\n prix TTC (en €) : " + (prixHt*(tva/100+1))*nbArticle );
    }

    public static void getExercice3_1() {
        Scanner scanner= new Scanner((System.in));
        System.out.println("Veuillez entrer un nombre");
        Integer nbUser = scanner.nextInt();
        if (nbUser>0){
            System.out.println("votre nombre est positif");
        } else {
            System.out.println("votre nombre est négatif");
        }
    }

    public static void getExercice3_2() {
        Scanner scanner= new Scanner((System.in));
        System.out.println("Veuillez entrer un nombre nb1");
        Integer nbUser1 = scanner.nextInt();
        System.out.println("Veuillez entrer un nombre nb2");
        Integer nbUser2 = scanner.nextInt();

        if (nbUser1*nbUser2>0){
            System.out.println("Le produit de " + nbUser1 +" et " + nbUser2 + " est positif");
        } else {
            System.out.println("Le produit de " + nbUser1 +" et " + nbUser2 + " est négatf");
        }
    }

    public static void getExercice3_3() {
        Scanner scanner= new Scanner((System.in));
        System.out.println("Veuillez entrer un premier nom");
        String nom1 = scanner.nextLine();
        System.out.println("Veuillez entrer un second nom");
        String nom2 = scanner.nextLine();
        System.out.println("Veuillez entrer un troisieme nom");
        String nom3 = scanner.nextLine();

        if (nom1.compareTo(nom2) < 0){
            if(nom2.compareTo(nom3) < 0) {
                System.out.println("les noms ont été entré par ordre alphabétique");
            } else {
                System.out.println("les noms n'ont pas été entré par ordre alphabétique");
            }
        } else {
            System.out.println("les noms n'ont pas été entré par ordre alphabétique");
        }
    }
}
