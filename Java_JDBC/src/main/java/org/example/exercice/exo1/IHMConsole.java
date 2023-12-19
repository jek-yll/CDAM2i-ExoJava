package org.example.exercice.exo1;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class IHMConsole {

        private static final Scanner sc = new Scanner(System.in);

        static void menu() {
            String[] propositions = {
                    "1 - Afficher tous les étudiant",
                    "2 - Afficher les étudiants d'une classe",
                    "3 - Supprimer un étudiant",
                    "4 - Ajouter un étudiant",
                    "5 - Rechercher un étudiant (nom, prenom)",
                    "0 - Fin"
            };

            for (String p: propositions){
                System.out.println(p);
            }

            int choix = parseInt(sc.next());
            sc.nextLine();

            switch (choix){
                case 1 -> {
                    getAllEtudiant();
                    menu();
                }
                case 2 -> {
                    getOneClasse();
                    menu();
                }
                case 3 -> {
                    deleteOneEtudiant();
                    menu();
                }
                case 4 -> {
                    addEtudiant();
                    menu();
                }
                case 5 -> {
                    getEtudiantByName();
                    menu();
                }
                case 0 -> {
                }
                default -> {
                    System.out.println("commande non répertorié");
                    menu();
                }
            }
        }

        private static void getAllEtudiant(){
            System.out.println("Voici tous les étudiants enregistré : ");
            EtudiantDb.getAllEtudiant();
        }

        private static void getOneClasse(){
            System.out.println("Saisir le numéro de la classe : ");
            int num = sc.nextInt();
            sc.nextLine();
            EtudiantDb.getOneClasse(num);
        }

        private static void addEtudiant(){
            System.out.println("Saisir le nom de l'étudiant : ");
            String nom = sc.nextLine();
            System.out.println("Saisir le prenom de l'étudiant : ");
            String prenom = sc.nextLine();
            System.out.println("Saisir le numéro de classe de l'étudiant : ");
            int num = sc.nextInt();
            sc.nextLine();
            System.out.println("Saisir la date d'obtention du diplome de l'étudiant (yyyy-mm-jj) : ");
            String date = sc.nextLine();
            EtudiantDb.addEtudiant(nom, prenom, num, date);
        }

        private static void deleteOneEtudiant(){
            System.out.println("Saisir l'id de l'étudiant a supprimer : ");
            int id = sc.nextInt();
            EtudiantDb.deleteEtudiant(id);
        }

        private static void getEtudiantByName(){
            System.out.println("Saisir le nom ou le prenom de l'étudiant recherché");
            String nom = sc.nextLine();
            EtudiantDb.getOneEtudiantByName(nom);
        }
}
