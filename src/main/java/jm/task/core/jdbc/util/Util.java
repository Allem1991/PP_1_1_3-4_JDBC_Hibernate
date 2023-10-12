package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String DB_URL= "jdbc:mysql://localhost:3306/task113pp";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "8413125867Qr";
    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
