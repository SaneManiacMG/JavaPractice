package com.sane.maniac.mg.jdbcexample;

import java.sql.DriverManager;

public class JDBCExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            // connection string url to MySql db
            Connection con = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=P@ssw0rd");

            // q: will the above lines create the DB if it doesn't exist?
            // a: no, it will not. you have to create the DB manually.
        }
    }
    
}
