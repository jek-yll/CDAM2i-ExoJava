package org.example;

import org.example.utils.ConnectionUtils;


import java.sql.*;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        // Test de la connection
//        try {
//            Connection connection = ConnectionUtils.getMySQLConnection();
//            if (connection != null){
//                System.out.println("Connexion ok");
//            } else {
//                System.out.println("Connexion Nok");
//            }
//        } catch (SQLException e){
//            throw new RuntimeException(e);
//        }
        Scanner scanner = new Scanner(System.in);
        Connection connection = null;
        try  {
            connection = ConnectionUtils.getMySQLConnection();
            System.out.println("connexion ok");
            System.out.println("Saisir le prenom :");
            String firstname = scanner.nextLine();
            System.out.println("Saisir le nom :");
            String lastname = scanner.nextLine();

            // Une requête pour l'insertion de données
            String requete = "INSERT INTO personne(first_name, last_name) VALUES ('" + firstname + "','" + lastname + "');";

            String requetePrepare = "INSERT INTO personne(first_name, last_name) VALUES ( ? , ? )";

            // Première solution → execution d'une requête sans retour
            /*
            Statement statement = connection.createStatement();
            boolean res = statement.execute(requete);
            System.out.println("Requete executé");
            System.out.println(res);
            */

            // Seconde solution → avec un requete préparée


            // version sans récuperation de l'id
            PreparedStatement preparedStatement = connection.prepareStatement(requetePrepare);
            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, lastname);
            preparedStatement.execute(); // retour boolean
            int nbRow = preparedStatement.executeUpdate(); // retour int
            System.out.println("Nombre de ligne affectée : "+ nbRow);


            /*
            // version avec récupération de l'id
            PreparedStatement preparedStatement = connection.prepareStatement(requetePrepare, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, lastname);
            int nbRow = preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            System.out.println("Nombre de ligne : "+ nbRow);
            if (resultSet.next()){
                System.out.println(resultSet.getInt(1));
            }
             */

            // Avec une requete de lecture
            String request = "SELECT * FROM personne";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(request);

            while (resultSet.next()){
                System.out.println(resultSet.getInt("id") +") " + resultSet.getString("first_name")+", "+ resultSet.getString("last_name"));
            }

            statement.close();

        } catch (SQLException e){
            System.out.println(e.getMessage());
        } finally {
            // Fermer la connexion à la bdd
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
