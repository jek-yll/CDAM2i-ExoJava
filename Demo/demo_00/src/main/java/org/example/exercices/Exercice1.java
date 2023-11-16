package org.example.exercices;
import java.util.Scanner;

public class Exercice1 {

    public static Scanner scanner = new Scanner(System.in);
    //region Exercice 2.2
    public static void getExercice2_2() {
        System.out.println("entrer un nombre");
        Integer nbr = scanner.nextInt();
        System.out.println("votre nombre au carré : " + nbr*nbr);
        scanner.close();
    }
    //endregion
    //region Exercice 2.3
    public static void getExercice2_3() {
        System.out.println("Quel est votre prénom : ");
        String prenom = scanner.next();
        System.out.println("Bonjour, " + prenom + " !");
        scanner.close();
    }
    //endregion
    //region Exercice 2.4
    public static void getExercice2_4() {
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
        scanner.close();
    }
    //endregion
    public static void getExercice3_1() {
        System.out.println("Veuillez entrer un nombre");
        int nbUser = scanner.nextInt();
        if (nbUser>0){
            System.out.println("votre nombre est positif");
        } else {
            System.out.println("votre nombre est négatif");
        }
        scanner.close();
    }

    public static void getExercice3_2() {
        System.out.println("Veuillez entrer un nombre nb1");
        int nbUser1 = scanner.nextInt();
        System.out.println("Veuillez entrer un nombre nb2");
        int nbUser2 = scanner.nextInt();

        if ((nbUser1 < 0) ^ (nbUser2 < 0)){
            System.out.println("Le produit de " + nbUser1 +" et " + nbUser2 + " est positif");
        } else {
            System.out.println("Le produit de " + nbUser1 +" et " + nbUser2 + " est négatf");
        }
        scanner.close();
    }

    public static void getExercice3_3() {
        System.out.println("Veuillez entrer un premier nom");
        String nom1 = scanner.nextLine().toLowerCase();
        System.out.println("Veuillez entrer un second nom");
        String nom2 = scanner.nextLine().toLowerCase();
        System.out.println("Veuillez entrer un troisieme nom");
        String nom3 = scanner.nextLine().toLowerCase();

        if (nom1.compareTo(nom2) < 0 && nom2.compareTo(nom3) < 0 ) {
            System.out.println("les noms ont été entré par ordre alphabétique");
        } else {
            System.out.println("les noms n'ont pas été entré par ordre alphabétique");
        }
        scanner.close();
    }
}
