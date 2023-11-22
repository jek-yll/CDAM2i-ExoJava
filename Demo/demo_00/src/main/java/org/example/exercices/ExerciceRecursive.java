package org.example.exercices;

public class ExerciceRecursive {

    public static int factorielle(int nb){
        if (nb == 0){
            //System.out.println(1);
            return 1;
        } else {
            int factorielle = nb*factorielle(nb-1);
            //System.out.print(nb + " * ");
            System.out.print(factorielle+ " ");
            return factorielle;
        }
    }
}
