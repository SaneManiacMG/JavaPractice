package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        // JDBC driver name and database URL
        String uname = "root";
        String password = "P@ssw0rd";
        String url = "jdbc:mysql://localhost:3306/dummy_db";
        String query = "SELECT * FROM EngineeringStudents";

        // Register JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            // Open a connection
            Connection con = DriverManager.getConnection(url, uname, password);
            // Execute a query
            Statement statements = con.createStatement();
            // Extract data from result set
            ResultSet resultSet = statements.executeQuery(query);

            System.out.println("Data from the database: ");
            while (resultSet.next()) {
                String data = "";
                for (int i = 1; i <= 6; i++) {
                    // Retrieve by column name
                    data += resultSet.getString(i) + " ";
                }
                System.out.println(data);
            }

            // Clean-up environment
            statements.close();

            // Close connection
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}