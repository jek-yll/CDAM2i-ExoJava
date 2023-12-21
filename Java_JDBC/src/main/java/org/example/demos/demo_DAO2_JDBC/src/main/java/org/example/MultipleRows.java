package org.example;

import org.example.utils.DatabaseManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MultipleRows {
    public static void main(String[] args) {
        Connection connection = DatabaseManager.getMySQLConnection();
        PreparedStatement statement = null;

        try {
            String req = "INSERT INTO person(first_name, last_name) VALUES (?,?)";

            statement = connection.prepareStatement(req);

            String[][] stagiaires = {
                    {"Remi","Jospin"},
                    {"Adil","Hanoun"},
                    {"Maxime","Morvant"}
            };

            // Insertion des stagiaires en bdd

            for (String[] stagiaire: stagiaires){
                statement.setString(1, stagiaire[0]);
                statement.setString(2, stagiaire[1]);

                // Ajouter la requete au batch
                statement.addBatch();
            }

            // Execution de la requete batch
            int[] rows = statement.executeBatch();

            System.out.println("Nombre de lignes inséreées : "+ rows.length);

            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
