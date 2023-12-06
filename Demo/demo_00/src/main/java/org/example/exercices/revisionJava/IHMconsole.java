package org.example.exercices.revisionJava;

import java.util.Scanner;

public class IHMconsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Créer des objets Lieu, Evenement, et Client pour tester
        Lieu lieu = new Lieu("Salle de concert", "123 Rue de la Musique", 500);
        Event evenement = new Event("Concert", "2023-01-01", "20:00", lieu, 25.0);
        Client client = new Client("John", "Doe", "john.doe@email.com");

        int choix;

        do {
            System.out.println("Menu interactif :");
            System.out.println("1. Gérer les lieux");
            System.out.println("2. Gérer les événements");
            System.out.println("3. Gérer les clients");
            System.out.println("4. Quitter");
            System.out.print("Entrez votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();  // Pour consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    gererLieux();
                    break;
                case 2:
                    gererEvenements();
                    break;
                case 3:
                    gererClients();
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 4);

    }

    private static void gererLieux() {
        // Implémenter les opérations d'ajout, de modification et de suppression de lieux
        // ...
        System.out.println("Gestion des lieux");
    }

    private static void gererEvenements() {
        // Implémenter les opérations d'ajout, de modification et de suppression d'événements
        // ...
        System.out.println("Gestion des événements");
    }

    private static void gererClients() {
        // Implémenter les opérations d'ajout, de modification et de suppression de clients
        // ...
        System.out.println("Gestion des clients");
    }

}
