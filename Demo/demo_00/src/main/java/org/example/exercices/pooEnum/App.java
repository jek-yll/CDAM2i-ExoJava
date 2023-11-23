package org.example.exercices.pooEnum;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer le type de message
        MessageType messageType = null;
        do {
            System.out.print("Entrez le type de message (A, B, C ou D) : ");
            String userInput = scanner.next().toUpperCase();

            try {
                // Essayer de convertir l'entrée en un type de message
                messageType = MessageType.valueOf(userInput);
            } catch (IllegalArgumentException e) {
                // En cas d'entrée invalide, demander à nouveau
                System.out.println("Type de message invalide. Veuillez réessayer.");
            }
        } while (messageType == null);

        // Une fois un type de message valide obtenu, imprimer la priorité
        System.out.println("La priorité du type de message est : " + messageType.getPriority());

        // Fermer le scanner
        scanner.close();


    }



}
