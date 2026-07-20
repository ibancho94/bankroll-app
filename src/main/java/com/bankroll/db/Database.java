package com.bankroll.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static final String URL =
            "jdbc:mariadb://localhost:3306/bankroll_db";
    private static final String USER = "bankroll_user";
    private static final String PASS = "bankroll_pass";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}