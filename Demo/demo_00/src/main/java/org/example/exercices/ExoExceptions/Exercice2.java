package org.example.exercices.ExoExceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercice2 {

    public static Scanner scanner = new Scanner(System.in);

    public static Integer calcTotalTableau () throws InputMismatchException{
        ArrayList<Integer> tabInt = new ArrayList<>();
        Integer somme = 0;
        System.out.println("Veuillez Saisir 5 chiffres");

        for (int i = 0; i < 5; i++) {
            Integer nb = scanner.nextInt();
            tabInt.add(nb);
        }

        for (Integer i: tabInt) {
            somme += i;
        }
        return somme;
    }

}
