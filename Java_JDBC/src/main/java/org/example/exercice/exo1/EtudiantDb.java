package org.example.exercice.exo1;

import org.example.exercice.exo1.utils.ConnectDb;

import java.sql.*;

public class  EtudiantDb {

    public static void init(){
        addEtudiant("jean", "Dupont", 1, "2023-01-01");
        addEtudiant("michel", "Marchand", 1, "2023-01-01");
        addEtudiant("Marc", "Dupond", 2, "2023-01-01");
        addEtudiant("Alfred", "Marchais", 3, "2023-01-01");
        addEtudiant("Henri", "Bouleau", 2, "2023-01-01");
    }

    public static void getAllEtudiant(){

        Connection connection = null;

        try {
            connection = ConnectDb.getMySQLConnection();

            String req = "SELECT * FROM etudiant;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(req);

            while (resultSet.next()){
                System.out.println(resultSet.getInt("id") +") "
                        + resultSet.getString("nom")+", "
                        + resultSet.getString("prenom")+", "
                        + resultSet.getInt("num_classe")+", "
                        + resultSet.getDate("date_diplome")
                );
            }

            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
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

    public static void getOneClasse (int num){
        Connection connection = null;

        try {
            connection = ConnectDb.getMySQLConnection();

            String req = "SELECT * FROM etudiant WHERE num_classe = ?;";

            PreparedStatement preparedStatement = connection.prepareStatement(req, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, num);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                System.out.println(resultSet.getInt("id") +") "
                        + resultSet.getString("nom")+", "
                        + resultSet.getString("prenom")+", "
                        + resultSet.getInt("num_classe")+", "
                        + resultSet.getDate("date_diplome")
                );
            }

            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
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

    public static void addEtudiant (String nom, String prenom, int num, String date ) {
        Connection connection = null;
        try {
            connection = ConnectDb.getMySQLConnection();
            String req = "INSERT INTO etudiant(nom, prenom, num_classe, date_diplome) VALUES (?,?,?,?);";

            PreparedStatement preparedStatement = connection.prepareStatement(req);

            preparedStatement.setString(1, nom);
            preparedStatement.setString(2, prenom);
            preparedStatement.setInt(3, num);
            preparedStatement.setString(4, date);

            int rows = preparedStatement.executeUpdate();

            if (rows > 0) {
                System.out.println("nouvel étudiant ajouté");
            } else {
                System.out.println("erreur lors de l'ajout d'un étudiant");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteEtudiant(int id){
        Connection connection = null;
        try {
            connection = ConnectDb.getMySQLConnection();
            String req = "DELETE FROM etudiant WHERE id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id);

            int nbRow = preparedStatement.executeUpdate();
            preparedStatement.execute();

            if (nbRow > 0){
                System.out.println("étudiant "+ id +" supprimé avec succès");
            } else {
                System.out.println("erreur lors de la suppression de l'étudiant n°=" + id);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getOneEtudiantByName (String nom){
        Connection connection = null;

        try {
            connection = ConnectDb.getMySQLConnection();

            String req = "SELECT * FROM etudiant WHERE nom = ? OR prenom = ?;";

            PreparedStatement preparedStatement = connection.prepareStatement(req, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, nom);
            preparedStatement.setString(2, nom);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                System.out.println(resultSet.getInt("id") +") "
                        + resultSet.getString("nom")+", "
                        + resultSet.getString("prenom")+", "
                        + resultSet.getInt("num_classe")+", "
                        + resultSet.getDate("date_diplome")
                );
            }

            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
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
