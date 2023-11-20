package org.example.exercices;

public class ExerciceTab3 {

    public static void exercice5_5(){
        int[] tab55 = new int[10];
        int[] tab55bis = new int[10];
        int temp = 0;

        System.out.println("----------- Création du tableau -----------");
        for (int i = 0; i < tab55.length; i++) {
            tab55[i] = (int)(Math.random()*30) +1;
            System.out.println("Valeur dans mon tableau : " + tab55[i] + " à la position : " + (i+1));
        }

        System.out.println("----------- Inversion du tableau -----------");
        for (int i = 0, j = tab55.length-1; i < tab55.length; i++, j--) {
            tab55bis[i] = tab55[j];
            System.out.println("Valeur dans mon tableau : " + tab55bis[i] + " à la position : " + (i+1));
        }

    }

    public static void exercice5_6(){
        int[] tab56 = new int[10];
        int min = 0;
        int temp = 0;

        System.out.println("----------- Création du tableau -----------");
        for (int i = 0; i < tab56.length ; i++) {
            tab56[i] = (int)(Math.random()*30) +1;
            System.out.println("Valeur dans mon tableau : " + tab56[i] + " à la position : " + (i+1));
        }

        System.out.println("\n----------- Tri à séléction du tableau -----------");
        for (int i = 0; i < tab56.length -1; i++) {
            min = i;
            for (int j = i+1; j < tab56.length; j++) {
                if (tab56[j] < tab56[min]){
                    min = j;
                }
            }
            temp = tab56[min];
            tab56[min] = tab56[i];
            tab56[i] = temp;

        }

        for (int i = 0; i < tab56.length; i++) {
            System.out.println("Valeur dans mon tableau : " + tab56[i] + " à la position : " + (i+1));
        }
    }

    public static void exercice5_7(){
        int[] tab57 = new int[10];
        int temp = 0;

        System.out.println("----------- Création du tableau -----------");
        for (int i = 0; i < tab57.length ; i++) {
            tab57[i] = (int)(Math.random()*30) +1;
            System.out.println("Valeur dans mon tableau : " + tab57[i] + " à la position : " + (i+1));
        }

        System.out.println("\n----------- Tri à bulle du tableau -----------");
        for (int i = 0; i < tab57.length; i++) {
            for (int j = 1; j < tab57.length-i; j++) {
                if (tab57[j-1] > tab57[j]){
                    temp = tab57[j-1];
                    tab57[j-1] = tab57[j];
                    tab57[j] = temp;
            }
        }
    }

        for (int i = 0; i < tab57.length; i++) {
            System.out.println("Valeur dans mon tableau : " + tab57[i] + " à la position : " + (i+1));
        }
    }

    public static void exercice5_8(){
        //int[][] tab1 = {{1, 2, 4}, {4, 5, 6}, {7, 8, 9}};
        //int[][] tab2 = {{1, 2}, {4, 5, 6}, {7, 8}};
        boolean estRegulier = true;

        int[] tab1 = {1,2,3,4,5,66,77};
        int[] tab2 = {4,5,8,7,5,9,8};
        int resultat = 0;

        int[][] tab = {tab1, tab2};

        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i].length != tab[i+1].length){
                estRegulier = false;
                break;
            } else {
                for (int j = 0; j < tab[i].length; j++) {
                    resultat = tab[i][j] + tab[i+1][j];
                    System.out.println("resultat de la somme : " + resultat);
                }
            }
        }

        if (estRegulier) {
            System.out.println("les tableaux sont réguliers");
        } else {
            System.out.println("les tableaux sont irrégulier");
        }
    }
}
