package org.example.exercices;

import org.example.array.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciceFunction1 {

    public static Scanner scanner = new Scanner(System.in);

    public static void exercice1(){
        System.out.println("Veuillez entrer des nombres entiers (chacun séparés par un espace)");
        String numbers = scanner.nextLine();
        String[] tabString = numbers.split(" ");
        int[] tabInt = new int[tabString.length];
        for (int i = 0; i < tabInt.length; i++) {
            tabInt[i] = Integer.parseInt(tabString[i]);
        }
        System.out.printf("la valeur maximale de votre tableau est %d",findMaxIntInArray(tabInt));
    }

    public static int findMaxIntInArray(int[] intArray){
        int max = intArray[0];

        for (int j : intArray) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static void exercice2(){
        System.out.println("Veuillez saisir la hauteur du rectangle");
        Integer hauteur = scanner.nextInt();
        System.out.println("Veuillez saisir la largeur du rectangle");
        Integer largeur = scanner.nextInt();

        drawRectangle(hauteur,largeur);

    }

    public static void drawRectangle(int hauteur, int largeur){
        String[][] display = new String[hauteur][largeur];

        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                if (i == 0 || i == hauteur-1){
                    display[i][j] = "*";
                } else {
                    display[i][j]= " ";
                    display[i][0] = "*";
                    display[i][largeur-1] = "*";
                }
            }
        }
        afficheTab2(display);
    }

    public static void exercice3(){
        System.out.println("Veuillez saisir un texte");
        String texte = scanner.nextLine();

        System.out.println(getWordsAmount(texte));
    }

    public static int getWordsAmount(String txt){
        String newTxt = txt.replaceAll("\\p{Punct}", "");
        String[] words = newTxt.trim().split(" ");
        return words.length;
    }

    public static void exercice4(){
        System.out.println("Veuillez entrer des mots aléatoires (chacun séparés par un espace)");
        String wordsUser = scanner.nextLine();
        String[] wordsTab = wordsUser.split(" ");
        System.out.println("Veuillez entrer la longueur minimale de la chaîne pour filtrer les mots qui ont été saisis");
        int minLength = scanner.nextInt();

        String[] tabFiltered = filterWordsByLength(minLength, wordsTab);

        for (int i = 0; i < tabFiltered.length; i++) {
            System.out.println(tabFiltered[i]);
        }
    }

    public static String[] filterWordsByLength(int minLength, String[] mots){

        String wordsSave = " ";

        for (int i = 0; i < mots.length; i++) {
            if (mots[i].length() >= minLength){
                wordsSave += mots[i]+" ";
            }
        }
        String[] newTab = wordsSave.split(" ");
        return newTab;
    }


    private static void afficheTab(int[][] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print("[" + tableau[i][j] + "]");
            }
            System.out.println("");
        }
    }
    private static void afficheTab2(String[][] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print( tableau[i][j] );
            }
            System.out.println("");
        }
    }

}
