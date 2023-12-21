package org.example;

import org.example.utils.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction {
    public static void main(String[] args) {
        Connection connection = DatabaseManager.getMySQLConnection();

        try {
            // Désactivation de l'autocommit pour les transactions
            connection.setAutoCommit(false);

            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO person(first_name, last_name) VALUES ('Mohamed', 'Aiiijou')");
            int nbRows = statement.executeUpdate("UPDATE person SET last_name = 'Aijou' WHERE first_name = 'Mohamed'");

//            if (nbRows == 1){
//                connection.commit();
//                System.out.println("TRANSACTION VALIDEE");
//            } else {
//                connection.rollback();
//                System.out.println("TRANSACTION ANNULEE");
//            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
            try {
                connection.rollback();
                System.out.println("TRANSACTION ANNULEE");
            } catch (SQLException ex) {
                System.out.println("Erreur lors de l'annulation de la transaction : " + e.getMessage());
            }


        }finally {
            // Fermer la connection
            DatabaseManager.closeConnection();
        }
    }
}
