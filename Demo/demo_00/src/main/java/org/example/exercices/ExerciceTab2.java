package org.example.exercices;

import java.util.Scanner;

public class ExerciceTab2 {

    public static Scanner scanner = new Scanner(System.in);
    public static void exercice5_1(){
        int tailleTab = 0;
        int numSearched = 0;
        int numIsFind = 0;

        System.out.println("Saisir la taille du tableau a exploiter (les valeurs seront aléatoires et comprise en 1 et 30");
        tailleTab = scanner.nextInt();
        System.out.println("\n Saisir un nombre un recherché dans ce tableau");
        numSearched = scanner.nextInt();

        int[] tab51 = new int[tailleTab];

        for (int i = 0; i < tailleTab; i++) {
            tab51[i] = (int)(Math.random() * 30) + 1;
            System.out.println("Valeur dans mon tableau : " + tab51[i] + " à la position : " + (i+1));
            if (tab51[i] == numSearched){
                numIsFind++;
            }
        }
        scanner.close();
        System.out.println("\nLa valeur : " + numSearched + " se trouve " + numIsFind + " fois dans le tableau");
    }
    public static void exercice5_2(){
        int[] tab51 = {1,2,3,4,5,6,7,8,9,10};
        int[] tab51Bis = {3,5,6,4,1,2,8,10,9};
        boolean isCroissant = true;

        for (int i = 0; i < tab51.length-1; i++) {
            if (tab51[i] > tab51[i + 1]) {
                isCroissant = false;
                break;
            }
        }

        if (isCroissant) {
            System.out.println("le Tableau est croissant");
        } else {
            System.out.println("le tableau est décroissant");
        }
    }
    public static void exercice5_3(){
        int[] tab53 = new int[15];
        int valMin = 0;
        int valMax = 0;
        int plusGrandEcart = 0;

        tab53[0] = (int)(Math.random() * 100) + 1;
        valMax = tab53[0];
        valMin = tab53[0];

        for (int i = 1; i < tab53.length; i++) {
            tab53[i] = (int)(Math.random() * 100) + 1;
            if (tab53[i] > valMax){
                valMax = tab53[i];
            }
            if (tab53[i] < valMin){
                valMin = tab53[i];
            }
        }

        plusGrandEcart = valMax - valMin;
        System.out.println("Le plus grand écart dans notre tableau est : " + plusGrandEcart + " (" + valMax +" - " + valMin + ") ");
    }
    public static void exercice5_4(){
        int[] tab54 = new int[15];
        int[] tab54Bis = new int[15];

        System.out.println("\n------- Tableau avant décalage -------\n");
        for (int i = 0; i < tab54.length; i++) {
            tab54[i] = (int)(Math.random() * 100) + 1;
            System.out.println("Valeur dans mon tableau : " + tab54[i] + " à la position : " + (i+1));
        }

        System.out.println("\n------- Tableau après décalage -------\n");
        tab54Bis[0] = tab54[tab54.length-1];
        for (int i = 0; i < tab54Bis.length-1; i++) {
            tab54Bis[i+1] = tab54[i];
        }

        for (int i = 0; i < tab54Bis.length; i++) {
            System.out.println("Valeur dans mon tableau : " + tab54Bis[i] + " à la position : " + (i+1));
        }

    }
}
