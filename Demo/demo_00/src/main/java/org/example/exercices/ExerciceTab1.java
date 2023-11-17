package org.example.exercices;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExerciceTab1 {

    public static Scanner scanner = new Scanner(System.in);
    public static void exercice1(){
        int[] tab1 = {1,2,3,4,5};

        System.out.println("la valeur de la troisieme case du tableau tab1 est : " + tab1[2]);
    }

    public static void exercice2(){
        int[] tab2 = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < tab2.length; i++) {
            System.out.println("l'élément " + (i+1) + " du tableau est : " + tab2[i]);
        }
    }

    public static void exercice3(){
        int[] tab3 = {10,20,30,40,50,60,70,80};
        int nbUser = 0;
        boolean win = false;

        System.out.println("Saisir un nombre à rechercher dans un tableau");
        nbUser = scanner.nextInt();

        for (int i = 0; i < tab3.length; i++) {
            if (nbUser != tab3[i]){
              win = true;
              break;
            }
        }

        if (win) {
            System.out.println("L'entier est présent dans le tableau ");
        } else {
            System.out.println("Lentier n'est pas présent dans le tableau");
        }
    }

    public static void exercice4() {
        int tab4[] = new int[5];
        boolean win = true;

        for (int i = 0; i < tab4.length; i++) {
            System.out.println("Saisir l'élément n°=" + (i+1) + " du tableau");
            tab4[i] = scanner.nextInt();
            if (tab4[i]%2!=0){
                win = false;
            }
        }

        if (win) {
            System.out.println("Tous les éléments du tableau sont pairs");
        } else {
            System.out.println("Au moins un élément du tableau est impair");
        }
    }

    public static void exercice5(){
        int tab5[] = new int[10];

        for (int i = 0; i < tab5.length; i++) {
            // (int)(Math.random() * range) + min;
            tab5[i] = (int)(Math.random() * 100) + 1;
            System.out.println("Valeur dans mon tableau : " + tab5[i] + " a la position : " + (i+1));
        }
    }

    public static void exercice6(){
        int tab6[] = new int[10];
        int tab6Bis[] = new int[10];
        int tabRes[] = new int[10];

        for (int i = 0; i < tab6.length; i++) {
            tab6[i] = (int)(Math.random() * 100) + 1;
            tab6Bis[i] = (int)(Math.random() * 100) + 1;
            tabRes[i] = tab6[i] + tab6Bis[i];
            System.out.println("\nElément " + (i+1) + " du premier tableau -> " + tab6[i] + " ; du second tableau -> " + tab6Bis[i] + " \n leur somme -> " + tabRes[i]);
        }
    }

    public static void exercice7(){
        int tab7[] = new int[10];
        int max = 0;

        for (int i = 0; i < tab7.length; i++) {
            tab7[i] = (int)(Math.random() * 100) + 1;
            System.out.println("Valeur dans mon tableau : " + tab7[i] + " a la position : " + i);
            if (tab7[i] > max){
                max = tab7[i];
            }
        }

        System.out.println("Voici l'élément max du tableau : " + max);
    }
}
