package org.example.utils;

import org.example.models.Person;
import org.example.services.PersonService;

import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleIHM {
    private static final Scanner sc = new Scanner(System.in);
    private static final PersonService personService = new PersonService();

    public static void menu() {

        String[] propositions = {
                "1 - Afficher toutes les personnes",
                "2 - Rechercher une personne (par son id)",
                "3 - Supprimer une personne",
                "4 - Ajouter une personne",
                "5 - Modifier une personne",
                "0 - Fin"
        };

        for (String p: propositions){
            System.out.println(p);
        }

        int choix = parseInt(sc.next());
        sc.nextLine();

        switch (choix){
            case 1 -> {
                getAll();
                menu();
            }
            case 2 -> {
                get();
                menu();
            }
            case 3 -> {
                delete();
                menu();
            }
            case 4 -> {
                add();
                menu();
            }
            case 5 -> {
                update();
                menu();
            }
            case 0 -> {
            }
            default -> {
                System.out.println("commande non répertorié");
                menu();
            }
        }
        personService.close();
        System.out.println("Au revoir");
    }
    private static void getAll(){
        List<Person> result = personService.getAllPersons();
        System.out.println(result);
    }

    private static void get(){
        System.out.println("Saisir l'id de la personne recherchée");
        int id = sc.nextInt();
        sc.nextLine();
        Person person = personService.getPerson(id);
        System.out.println(person);
    }

    private static void delete(){
        System.out.println("Saisir l'id de la personne recherchée");
        int id = sc.nextInt();
        sc.nextLine();
        personService.deletePerson(id);
    }

    private static void add(){
        System.out.println("Saisir le prenom de la personne : ");
        String prenom = sc.nextLine();
        System.out.println("Saisir le nom de la personne : ");
        String nom = sc.nextLine();
        personService.createPerson(prenom, nom);
    }

    private static void update(){
        System.out.println("Saisir l'id de la personne à modifier : ");
        int id = sc.nextInt();
        sc.nextLine();

        Person personUpdated = personService.getPerson(id);

        if (personUpdated == null){
            System.out.println("utilisateur non trouvé");
            return;
        }

        System.out.println("Saisir le nouveau prenom de la personne : ");
        String prenom = sc.nextLine();
        System.out.println("Saisir le nouveau nom de la personne : ");
        String nom = sc.nextLine();

        personUpdated.setFirstName(prenom);
        personUpdated.setLastName(nom);
        personService.updatePerson(personUpdated);

    }
}
