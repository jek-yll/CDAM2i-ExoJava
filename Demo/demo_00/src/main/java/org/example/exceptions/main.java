package org.example.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("*********Division*********");
            System.out.println("Donnez moi un nombre");
            Integer valeur = sc.nextInt();
            System.out.println("Donnez moi un diviseur : ");
            Integer diviseur = sc.nextInt();
            double resultat = valeur / diviseur;
            System.out.println("Resultat : " + resultat);
        }
        catch (ArithmeticException | InputMismatchException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Une exception !!!");
        }

        System.out.println("Fin du programme !!!");

        Cards cards = new Cards();

        cards.trade(1);

        try {
        cards.drawCards(5);
        }
        catch (MyExceptions e){
            System.out.println(e.getMessage());
        }
    }
}
