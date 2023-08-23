package com.jdbc_;

import org.postgresql.Driver;

import java.sql.*;

/**
 * @author 欧欧
 * @version 1.0
 */
public class JDBC01 {

    public static void main(String[] args) throws SQLException {
        // create lib for JDBC Driver
        // 1. register driver
        Driver driver = new Driver();
        // 2.get connection
        String url = "jdbc:postgresql://localhost:5432/sdb_course";
        String username = "zowcool";
        String password = "999814";
        Connection connection = DriverManager.getConnection(url, username, password);
        // 3.Execute SQL
        String sql = "INSERT INTO baea_nests (nest_id) VALUES (8848);";
        Statement statement = connection.createStatement(); //
        int i = statement.executeUpdate(sql);
        System.out.println(i);
        // 4.close
        statement.close();
        connection.close();
    }

}
