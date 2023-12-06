package org.example.exercices.pooHotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class IHM {
    private static Scanner scanner = new Scanner(System.in);

    private static Hotel hotel;

    public static void main(String[] args) {
        System.out.println("Veuillez entrer le nom de l'hotel");

        String nomHotel = scanner.nextLine();

        Hotel newHotel = new Hotel(nomHotel);

        newHotel.setRooms(createRooms());

        System.out.printf("Hotel %s crée avec succès, 20 chambres ont été initialisées. \n",newHotel.getName());

        System.out.println("1. Ajouter un client ");
        System.out.println("2. Afficher la liste des clients");
        System.out.println("3. Afficher les réservation d'un client");
        System.out.println("4. Ajouter une réservation");
        System.out.println("5. Annuler un réservation");
        System.out.println("6. Afficher la liste des réservation");

        int choix = scanner.nextInt();


            switch (choix){
                case 1 :
                    newHotel.getClients().add(ajouterClient());
                    choix = 0;
                    break;
                case 2 :
                    newHotel.toStringClient();
                    break;
                case 3 :
                    afficherReservationClient();
                    break;
                case 4 :
                    ajouterReservation();
                    break;
                case 5 :
                    annulerReservation();
                    break;
                case 6 :
                    afficherListeReservations();
                    break;
                case 7 :
                    System.exit(7);
                    break;
                default:
                    System.out.println("Veuillez réessayer");
        }
    }

    public static List<Room> createRooms(){

        Random random = new Random();
        List<Room> initialRooms = new ArrayList<>();

        for (int i = 1; i < 21 ; i++) {
                Integer capacite = random.nextInt(4)+1;
                Integer price = random.nextInt() * 100 + 50;

                Room room = new Room(i, Statut.LIBRE, price, capacite);

            initialRooms.add(room);
        }
        return initialRooms;
    }


    public static Client ajouterClient(){

        System.out.println("Veuiller entrer le nom du client");
        String firstname = scanner.next();

        System.out.println("Veuiller entrer le prénom du client");
        String lastname = scanner.next();
        System.out.println("Veuiller entrer le numéro de téléphone du client");
        String phoneNumber = scanner.next();

        return new Client(firstname, lastname, phoneNumber);

    }

    public static void afficherListeClient(){

    }

    public static void afficherReservationClient(){

    }

    public static void ajouterReservation(){

    }

    public static void annulerReservation(){

    }

    public static void afficherListeReservations(){

    }

}
