package org.example.exercices.ExoExceptions;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

//        try {
//            System.out.println(Exercices.convertStringToInt());
//            System.out.println(Exercices.accessElemByIndex(10));
//        }
//        catch (NumberFormatException e){
//            System.out.println(e.getMessage());
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }

        try {
        System.out.println(Exercice2.calcTotalTableau());
        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }


    }

}
