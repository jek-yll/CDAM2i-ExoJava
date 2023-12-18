package org.example.exercice.exo1.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDb {

    public static Connection getMySQLConnection() throws SQLException{
        // Avec MySQL
        String url = "jdbc:mysql://localhost:3306/JDBC_exercice1";
        String userName = "root";
        String passWord = "admin";

        Connection connection = DriverManager.getConnection(url, userName, passWord);
        return connection;
    }

}
