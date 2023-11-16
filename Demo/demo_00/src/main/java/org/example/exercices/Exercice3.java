package org.example.exercices;

import java.util.Scanner;

public class Exercice3 {

    public static Scanner scanner = new Scanner(System.in);
    public static void getExercice5_1() {
        int nbUser = 0;

        while (nbUser < 1 || nbUser > 3){
            System.out.println("Saisir un nombre compris entre 1 et 3 (inclus)");
            nbUser = scanner.nextInt();
        }
        System.out.println("Good Job !");
        scanner.close();
    }
    public static void getExercice5_2() {
        int nbUser = 0;
        boolean win = false;

        while (!win){
            System.out.println("Saisir un nombre compris entre 10 et 20 (inclus)");
            nbUser = scanner.nextInt();
            if (nbUser < 10 ){
                System.out.println("Plus Grand !");
                continue;
            } else if (nbUser > 20){
                System.out.println("Plus Petit !");
                continue;
            } else {
                win = true;
            }
        }
        System.out.println("Good Job !");
        scanner.close();
    }
    public static void getExercice5_3() {
        int nbDepart = 0;
        int i = 0;

        System.out.println("Saisir un nombre de départ :");
        nbDepart = scanner.nextInt();
        i = nbDepart+1;

        while ( i <= nbDepart+10){
            System.out.println(i);
            i++;
        }
        scanner.close();
    }
    public static void getExercice5_4() {
        int nbDepart = 0;

        System.out.println("Saisir un nombre de départ :");
        nbDepart = scanner.nextInt();

        for (int i = nbDepart+1; i <= nbDepart+10; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
    public static void getExercice5_5() {
        int nbUser = 0;

        System.out.println("Saisir un nombre :");
        nbUser = scanner.nextInt();

        System.out.println("\n Table de : "+ nbUser);
        for (int i = 1; i <=10 ; i++) {
            System.out.println(+ i + " x " + nbUser + " = " + (nbUser*i));
        }
        scanner.close();
    }
    public static void getExercice5_6() {
        int nbDepart = 0;
        int result = 0;

        System.out.println("Saisir un nombre de départ :");
        nbDepart = scanner.nextInt();

        for (int i = 1; i <= nbDepart; i++) {
            result += i;
        }
        System.out.println("La somme des " + nbDepart + " premiers entiers est : " + result);
        scanner.close();
    }
    public static void getExercice5_7() {
        int nbUser = 0;
        int nbMax = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Saisir le nombre numéro " + (i+1) + " :");
            nbUser = scanner.nextInt();
            if(i == 0){
                nbMax = nbUser;
            }
            if (nbUser > nbMax){
                nbMax = nbUser;
            }
        }
        System.out.println("Le nombre max saisi est : " + nbMax);
        scanner.close();
    }
    public static void getExercice5_7_2() {
        int nbUser = 0;
        int nbMax = 0;
        int pos = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Saisir le nombre numéro " + (i+1) + " :");
            nbUser = scanner.nextInt();
            if(i == 0){
                nbMax = nbUser;
                pos = i + 1;
            }
            if (nbUser > nbMax){
                nbMax = nbUser;
                pos = i + 1;
            }
        }
        System.out.println("Le nombre max saisi est : " + nbMax + "\n il s'agit du nombre numero : " + pos);
        scanner.close();
    }
    public static void getExercice5_8() {
        int nbUser = 0;
        int result = 1;

        System.out.println("Saisir un nombre afin de calculer se factorielle");
        nbUser = scanner.nextInt();
        for (int i = 1; i <= nbUser ; i++) {
            result *= i;
        }

        System.out.println(result);
        scanner.close();
    }
    public static void getExercice5_9() {
        int nbUser = -1;
        int nbMax = 0;
        int pos = 0;
        int i = 0;

        while (nbUser != 0){
            System.out.println("Saisir le nombre numéro " + (i+1) + " :");
            nbUser = scanner.nextInt();
            if(i == 0){
                nbMax = nbUser;
                pos = i + 1;
            }
            if (nbUser > nbMax){
                nbMax = nbUser;
                pos = i + 1;
            }
            i++;
        }

        System.out.println("Le nombre max saisi est : " + nbMax + "\n il s'agit du nombre numero : " + pos);
        scanner.close();
    }
    public static void getExercice5_10() {

        int price = 0;
        int sum = 0;
        int i = 1;
        int paiement = 0;
        int aRendre = 0;

        System.out.println("Saisir le prix de l'article " + i );
        price = scanner.nextInt();
        sum = price;
        i++;

        while (price != 0){
            System.out.println("Saisir le prix de l'article " + i );
            price = scanner.nextInt();
            sum += price;
            i++;
        }

        System.out.println("Total à payer : " + sum);
        System.out.println("\nPaiement du client : ");
        paiement = scanner.nextInt();
        aRendre = paiement - sum;
        System.out.println("\n\nA rendre : " + aRendre);

        while (aRendre != 0){
            if (aRendre-10>=0){
                aRendre -= 10;
                System.out.println("rendre 10 €");
                continue;
            } else if (aRendre-5>=0) {
                aRendre -= 5;
                System.out.println("rendre 5 €");
                continue;
            } else if (aRendre-1>=0) {
                aRendre -= 1;
                System.out.println("rendre 1 €");
                continue;
            }
        }
        scanner.close();
    }

    public static void getExercice5_11() {

        int sum = 0;
        int nb = 0;

        while (sum <= 100){
            nb ++;
            sum += nb;
        }

        System.out.println("Le premier N tel que la somme des premiers entiers de 1 à N dépasse 100 est : " + nb);
        scanner.close();
    }

}
