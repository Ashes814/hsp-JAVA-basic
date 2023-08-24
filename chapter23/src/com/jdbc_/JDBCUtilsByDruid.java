package com.jdbc_;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author 欧欧
 * @version 1.0
 */
public class JDBCUtilsByDruid {
    private static DataSource ds;

    static {
        Properties properties = new Properties();
        try {
            properties.load((new FileInputStream("/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter23/src/druid.properties")));
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch ( Exception e) {
            e.printStackTrace();
        }
    }

    // getConnection
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    // close, in dbcp close (shutdown reference) is different from normal way
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

    public static void close(Connection connection) {

        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
