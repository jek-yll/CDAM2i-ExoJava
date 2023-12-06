package org.example.exercices.ExoExceptions;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Exercices {

    public static Scanner sc = new Scanner(System.in);

    public static Integer convertStringToInt() throws NumberFormatException{
        System.out.println("Veuillez entrer une chaine de caractères ");
        String ch = sc.nextLine();
        return parseInt(ch);
    }

    public static Integer accessElemByIndex(int index){
        Integer[] tabDeInt = {1,2,3,4,5,6,7,8,9,10};
        if (index >= tabDeInt.length){
            throw new ArrayIndexOutOfBoundsException("Tu as dépassé le tableau");
        }
        return tabDeInt[index];
    }
}
