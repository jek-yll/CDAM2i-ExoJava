package org.example.exercices;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciceMatrix1 {

    public static void exercice1(){

        int[][] matrix1 = {{45,23,34,56,30},{67,75,21,52,59},{89,34,19,19,15},{1,78,90,48,42}};
        int max = matrix1[0][0];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j]>max){
                    max = matrix1[i][j];
                }
            }
        }

        System.out.printf("La valeur max est : %d",max);

    }

    public static void exercice2(){
        int[][] matrix2 = new int[4][5];
        int cpt = 0;
        int somme = 0;
        int moyenne = 0;
        long produit = 1;

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                cpt++;
                matrix2[i][j] = cpt;
                somme += cpt;
                produit *= cpt;
            }
        }

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.printf("%d ", matrix2[i][j]);
            }
            System.out.println();
        }
        moyenne = somme/cpt;
        System.out.printf("\nsomme de la matrice : %d\nproduit total: %d\nmoyenne: %d",somme,produit,moyenne);
    }

    public static void ventes(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de vendeurs : ");
        int nombreVendeurs = scanner.nextInt();

        System.out.print("Entrez le nombre de véhicules : ");
        int nombreVehicules = scanner.nextInt();

        String[][] tableauVentes = new String[nombreVehicules + 1][nombreVendeurs + 1];

        tableauVentes[0][0] = " ";
        for (int j = 1; j <= nombreVendeurs; j++) {
            System.out.print("Entrez le nom du vendeur " + j + " : ");
            tableauVentes[0][j] = scanner.next();
        }

        for (int i = 1; i <= nombreVehicules; i++) {
            System.out.print("Entrez le type de véhicule " + i + " : ");
            tableauVentes[i][0] = scanner.next();

            for (int j = 1; j <= nombreVendeurs; j++) {
                System.out.print("Entrez le nombre de ventes de " + tableauVentes[i][0] +
                        " par " + tableauVentes[0][j] + " : ");
                tableauVentes[i][j] = String.valueOf(scanner.nextInt());
            }
        }

        for (int i = 0; i < tableauVentes.length; i++) {
            for (int j = 0; j < tableauVentes[i].length; j++) {
                System.out.printf(" %s ", tableauVentes[i][j]);
            }
            System.out.println();
        }

    }

    public static void exerciceVehicule(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir la liste des vendeurs");
        String vendeurString = scanner.nextLine();
        String[] vendeursTab  = vendeurString.split("\\W");

        System.out.println("Veuillez saisir la liste des véhicules");
        String vehiculesString = scanner.nextLine();
        String[] vehiculesTab  = vehiculesString.split("\\W");

        String[][] ventes = new String[vehiculesTab.length+1][vendeursTab.length+1];

        for (int i = 0; i < vehiculesTab.length; i++) {
            ventes[i][0] = vehiculesTab[i];

            for (int j = 0; j < vendeursTab.length; j++) {
                ventes[0][j] = vendeursTab[j];
                System.out.println("Saisir le nombre de ventes de " + ventes[i][0] + " par " + ventes[0][j] + " : ");
                ventes[i][j] = String.valueOf(scanner.nextInt());
            }
        }

        for (int i = 0; i < ventes.length; i++) {
            for (int j = 0; j < ventes[i].length; j++) {
                System.out.println(ventes[i][j]);
            }
            System.out.println();
        }
    }
}
