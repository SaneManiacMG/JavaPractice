package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        String uname = "root";
        String password = "P@ssw0rd";
        String url = "jdbc:mysql://localhost:3306/dummy_db";
        String query = "SELECT * FROM EngineeringStudents";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection con = DriverManager.getConnection(url, uname, password);
            Statement statements = con.createStatement();
            ResultSet resultSet = statements.executeQuery(query);

            System.out.println("Data from the database: ");
            while (resultSet.next()) {
                String data = "";
                for (int i = 1; i <= 6; i++) {
                    data += resultSet.getString(i) + " ";
                }
                System.out.println(data);
            }

            statements.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}