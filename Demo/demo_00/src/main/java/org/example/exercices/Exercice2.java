package org.example.exercices;
import java.util.Scanner;

public class Exercice2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void getExercice3_4(){
        int nbUser = 0;

        System.out.println("Saisir un nombre : ");
        nbUser = scanner.nextInt();

        if (nbUser == 0) {
            System.out.println("Nombre saisi égal à 0");
        } else if (nbUser > 0){
            System.out.println("Nombre saisi positif");
        } else {
            System.out.println("Nombre saisi négatif");
        }
        scanner.close();
    }

    public static void getExercice3_5(){
        int age = 0;

        System.out.println("Saisir votre age :");
        age = scanner.nextInt();

        if (age>=18){
            System.out.println("Vous etes trop vieux pour vous inscrire");
        } else if(age >=12) {
            System.out.println("Vous etes Cadet");
        } else if (age >= 10){
            System.out.println("Vous etes Minime");
        } else if (age >= 8){
            System.out.println("Vous etes Pupille");
        } else if (age >= 6){
            System.out.println("Vous etes Poussin");
        } else {
            System.out.println("Vous etes trop jeune pour vous insrire");
        }
        scanner.close();
    }

    public static void getExercice3_6() {
        int nbUser = 0;

        System.out.println("Saisir un nombre");
        nbUser = scanner.nextInt();

        if (nbUser%3==0){
            System.out.println("Le nombre saisi (" + nbUser + ") est divisible par 3");
        } else {
            System.out.println("Le nombre saisi (" + nbUser + ") n'est pas divisible par 3");
        }
        scanner.close();
    }

    public static void getExercice3_7() {

        int nbPhotocop = 0;
        float total = 0;
        float totalRounded = 0;
        System.out.println("Saisir le nombre de photocopie à effectuer");
        nbPhotocop = scanner.nextInt();

        for (int i = 0; i < nbPhotocop ; i++) {
            if (i<10){
                total += 0.15F;
            } else if (i<20){
                total += 0.10F;
            } else {
                total += 0.05F;
            }
        }

        totalRounded = Math.round(total*100)/100F;
        System.out.println("Total de votre facture : " + totalRounded);
        scanner.close();
    }
}
