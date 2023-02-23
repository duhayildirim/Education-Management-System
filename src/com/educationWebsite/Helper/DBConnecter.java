package com.educationWebsite.Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnecter {
    private Connection connect = null;

    public Connection connectDB() {
        try {
            DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=mysql");
//            this.connect = DriverManager.getConnection(Config.DB_URL, Config.DB_USERNAME, Config.DB_PASSWORD);
//            PreparedStatement ps = connect.prepareStatement(Config.DB_NAME);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return this.connect;
    }

    public static Connection getInstance(){
        DBConnecter db = new DBConnecter();
        return db.connectDB();
    }
}
