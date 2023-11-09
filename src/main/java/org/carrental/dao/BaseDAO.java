package org.carrental.dao;

import java.sql.*;

public class BaseDAO {


    static final String DB_URL = "jdbc:mysql://localhost:3306/myFirstDb";
    static final String USER = "root";
    static final String PASS = "";

    Connection conn;

   public BaseDAO()
   {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }
}
