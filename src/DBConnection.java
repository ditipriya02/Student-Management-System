// DBConnection.java
// Handles MySQL database connection

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/student_db";
    private static final String USER = "root"; // change if different
    private static final String PASSWORD = "MySql@2026"; // change this

    // Method to get database connection
    public static Connection getConnection() {

        Connection con = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            con = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Database connected successfully");

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }

        return con;
    }
}
