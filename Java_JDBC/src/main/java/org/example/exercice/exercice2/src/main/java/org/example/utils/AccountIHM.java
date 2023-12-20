package org.example.utils;

import org.example.models.BankAccount;
import org.example.models.BankingTransaction;
import org.example.models.Status;
import org.example.services.CustomerService;

import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class AccountIHM {

    private static final Scanner sc = new Scanner(System.in);
    private static final CustomerService customerService = new CustomerService();


    public static void menu(){
        String[] options = {
                //TODO: Affichage compte / Ajouter un compte / Voir tous les comptes
                "1 - Nouveau client et compte",
                "2 - Depot",
                "3 - Retrait",
                "4 - Afficher mes comptes",
                "5 - Historique de compte",
                "0 - Fin"
        };

        for (String o: options){
            System.out.println(o);
        }

        int choix = parseInt(sc.next());
        sc.nextLine();

        switch (choix){
            case 1 -> {
                addCustomer();
                menu();
            }
            case 2 -> {
                operation(Status.DEPOSIT);
                menu();
            }
            case 3 -> {
                operation(Status.WITHDRAWAL);
                menu();
            }
            case 4 -> {
                allAccount();
                menu();
            }
            case 5 -> {
                history();
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

    private static void addCustomer(){
        System.out.println("Prenom :");
        String prenom = sc.nextLine();
        System.out.println("Nom :");
        String nom = sc.nextLine();
        System.out.println("Numero de telephone :");
        String telephone = sc.nextLine();
        customerService.createCustomer(prenom, nom, telephone);
    }

    private static void operation(Status status){
        System.out.println("Veuillez saisir votre numéro de compte");
        int accountId = sc.nextInt();
        sc.nextLine();

        if (status == Status.DEPOSIT){
            System.out.println("Veuillez saisir le montant à déposer");
        } else if (status == Status.WITHDRAWAL) {
            System.out.println("Veuillez saisir le montant à retirer");
        }

        int amount = sc.nextInt();
        sc.nextLine();
        BankAccount bankAccount = customerService.getAccount(accountId);

        if (status == Status.DEPOSIT){
            customerService.updateBalance(bankAccount, amount, Status.DEPOSIT);
        } else if (status == Status.WITHDRAWAL) {
            customerService.updateBalance(bankAccount, amount, Status.WITHDRAWAL);
        }

    }

    private static void history(){
        System.out.println("Veuillez saisir votre numéro de compte");
        int accountId = sc.nextInt();
        sc.nextLine();

        List<BankingTransaction> transactions = customerService.getAllTransactions(accountId);

        for (BankingTransaction t : transactions ) {
            System.out.println(t);
        }
    }

    private static void allAccount(){
        System.out.println("Saisir votre identifiant");
        int customerId = sc.nextInt();
        sc.nextLine();

        List <BankAccount> accounts = customerService.getAllAccount(customerId);

        for (BankAccount a : accounts ) {
            System.out.println(a);
        }
    }

}
