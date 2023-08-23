package com.jdbc_;

import org.junit.jupiter.api.Test;
import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;




/**
 * @author 欧欧
 * @version 1.0
 */
public class JDBC02 {

    @Test
    public void connect01() throws SQLException {
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
    @Test
    public void connect02() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        // using reflection to load Driver, more flexible, dynamic loading
        Class<?> cls = Class.forName("org.postgresql.Driver");
        Driver driver = (Driver) cls.newInstance();

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

    @Test
    public void connect03() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class<?> cls = Class.forName("org.postgresql.Driver");
        Driver driver = (Driver) cls.newInstance();

        String url = "jdbc:postgresql://localhost:5432/sdb_course";
        String username = "zowcool";
        String password = "999814";

        DriverManager.registerDriver(driver);
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
