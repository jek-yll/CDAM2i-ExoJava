package org.example.utils;

import org.example.Exception.CustomFormatException;
import org.example.model.Customer;
import org.example.model.Ticket;
import org.example.service.BilletterieService;

import java.util.*;

public class Ihm {

    private static BilletterieService billetterieService = new BilletterieService();
    private Scanner s = new Scanner(System.in);

    public Ihm() {
    }

    public void start() {
        this.menuGenerale();
    }

    public void menuGenerale (){
        try{
            System.out.println("----------menu---------");
            System.out.println("1/ action Lieux");
            System.out.println("2/ action Evenements");
            System.out.println("3/ action client");
            System.out.println("0/ quitter");
            System.out.println("entrer votre choix :");
            int entry = s.nextInt();
            s.nextLine();
            switch (entry){
                case 1:
                    this.menuLieux();
                    break;
                case 2 :
                    this.menuEvenement();
                    break;
                case 3:
                    this.menuCLient();
                    break;
                case 0 :
                    break;
                default:
                    System.out.println("entrer une valeur correspondant a un choix");
                    this.menuGenerale();
                    break;
            }

        }
        catch (InputMismatchException e){
            System.out.println("entrer une valeur numerique ");
            this.menuGenerale();
        }

    }

    // CUSTOMER MANAGER
    public void menuCLient (){
        try{
            System.out.println("----------menu Client---------");
            System.out.println("1/ ajouter un Client");
            System.out.println("2/ modifier un Client");
            System.out.println("3/ supprimer un Client");
            System.out.println("4/ acheter un billet");
            System.out.println("5/ annuler un billet");
            System.out.println("6/ afficher la liste des billets d'un clients");
            System.out.println("0/ retourner au menu generale");
            System.out.println("entrer votre choix :");
            int entry = s.nextInt();
            s.nextLine();
            switch (entry){
                case 1:
                    this.addClient();
                    break;
                case 2:
                    this.modifClient();
                    break;
                case 3 :
                    this.suprClient();
                    break;
                case 4 :
                    achatBillet(true);
                    break;
                case 5 :
                    achatBillet(false);
                    break;
                case 6:
                    affichageBillet();
                    break;
                case 0:
                    this.menuGenerale();
                default :
                    System.out.println("entrer une valeur correspondant a un choix");
                    this.menuCLient();
            }
        }
        catch (InputMismatchException e){
            System.out.println("entrer une valeur numerique ");
            this.menuCLient();
        }
    }
    public void addClient (){
        System.out.println("Prénom : ");
        String firstname = s.nextLine();
        System.out.println("Nom :");
        String lastname = s.nextLine();
        System.out.println("Email :");
        String email = s.nextLine();

        billetterieService.createCustomer(firstname, lastname, email);
    }

    public void modifClient () {
        System.out.println("Identifiant du client à modifier :");
        int id = s.nextInt();
        s.nextLine();

        Customer customer = billetterieService.getCustomer(id);
        if (customer == null){
            System.out.println("Client non trouvé");
            return;
        }

        System.out.println("Nouveau nom : ");
        String newFirestname = s.nextLine();
        System.out.println("Nouveau prénom : ");
        String newLastname = s.nextLine();
        System.out.println("Nouveau email : ");
        String newEmail = s.nextLine();

        customer.setFirstname(newFirestname);
        customer.setLastname(newLastname);

        try {
        customer.setEmail(newEmail);
        } catch (CustomFormatException e){
            e.getMessage();
        }

        if(billetterieService.updateCustomer(customer)){
            System.out.println("Client modifié avec succès.");
        };
    }

    public void suprClient (){
        System.out.println("Saisir l'identifiant du client à supprimer : ");
        int idCustomer = s.nextInt();
        s.nextLine();

        if (billetterieService.getCustomer(idCustomer) != null){
            billetterieService.deleteCustomer(idCustomer);
            System.out.println("Utilisateur supprimer avec succès");
        } else {
            System.out.println("Echec lors de la suppression du client");
        }
    }

    public void achatBillet (boolean achat){

    }
    public void affichageBillet (){
        System.out.println("Saisir l'identifiant client");
        int idCustomer = s.nextInt();
        s.nextLine();
        List<Ticket> customerTickets = billetterieService.getTicketsByCustomer(idCustomer);

        for (Ticket t : customerTickets) {
            String display = t.getCustomer().customerDisplay() + t.getEvent().customerDisplay() ;
            System.out.println(display);
        }
    }

    public void menuLieux (){
        try{
            System.out.println("----------menu Lieux---------");
            System.out.println("1/ ajouter un lieu");
            System.out.println("2/ modifier un lieu");
            System.out.println("3/ supprimer un lieu");
            System.out.println("0/ retourner au menu generale");
            System.out.println("entrer votre choix :");
            int entry = s.nextInt();
            switch (entry){
                case 1:
                    this.addLieux();
                    break;
                case 2:
                    this.modifLieu();
                    break;
                case 3 :
                    this.suprLieu();
                    break;
                case 0:
                    this.menuGenerale();
                    break;
                default :
                    System.out.println("entrer une valeur correspondant a un choix");
                    this.menuLieux();
                    break;
            }
        }
        catch (InputMismatchException e){
            System.out.println("entrer une valeur numerique ");
            this.menuLieux();
        }
    }

    public void addLieux (){

    }

    public void modifLieu (){

    }

    public void suprLieu (){

    }
    // gestion des evenements

    public void menuEvenement (){
        try{
            System.out.println("----------menu Evenement---------");
            System.out.println("1/ ajouter un Evenement");
            System.out.println("2/ modifier un Evenement");
            System.out.println("3/ supprimer un Evenement");
            System.out.println("4/ afficher la liste des evenements");
            System.out.println("0/ retourner au menu generale");
            System.out.println("entrer votre choix :");
            int entry = s.nextInt();
            switch (entry){
                case 1:
                    this.addEvenement();
                    break;
                case 2:

                    break;
                case 3 :
                        this.suprEvenement();
                    break;
                case 4 :

                    break;
                case 0:
                    this.menuGenerale();
                    break;
                default :
                    System.out.println("entrer une valeur correspondant a un choix");
                    this.menuEvenement();
                    break;
            }
        }
        catch (InputMismatchException e){
            System.out.println("entrer une valeur numerique ");
            this.menuCLient();
        }
    }

    public void addEvenement (){

    }

    public void suprEvenement (){

    }

    //fonctions global
    public void afficheList (List list){
        list.forEach(System.out::println);
        System.out.println();
    }
}
