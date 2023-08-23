package com.jdbc_;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author 欧欧
 * @version 1.0
 */
public class JDBCUtils {
    private static String user;
    private static String password;
    private static String url;
    private static String driver;

    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter23/src/test.properties"));
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            url = properties.getProperty("url");
            driver = properties.getProperty("driver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //connecting database, return connection
     public static Connection getConnection() {
         try {
             return DriverManager.getConnection(url, user, password);
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
     }

    // closing resource
    /*
    * 1. Result Set
    * 2. Statement or PreparedStatement
    * 3. Connection
    * */
    public static void close(ResultSet set, Statement statement, Connection connection) {

        try {
            set.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(Statement statement, Connection connection) {

        try {
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
