package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {

    public static Connection getMySQLConnection() throws SQLException{
        // Avec MySQL
        String url = "jdbc:mysql://localhost:3306/demo_jdbc";
        String userName = "root";
        String passWord = "admin";

        Connection connection = DriverManager.getConnection(url, userName, passWord);
        return connection;
    }

}
