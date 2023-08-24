package com.connectPool;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;

import javax.swing.text.EditorKit;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author 欧欧
 * @version 1.0
 */
public class C3P0Test {
    // 1, user，url, password dispatched in program
    @Test
    public void testC3P0_01() throws Exception {
        // 1. Create a Data Source Object
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

        // 2. get information by config file
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter23/src/test.properties"));
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            String url = properties.getProperty("url");
            String driver = properties.getProperty("driver");

            // set parameter for data source
            comboPooledDataSource.setDriverClass(driver);
            comboPooledDataSource.setJdbcUrl(url);
            comboPooledDataSource.setUser(user);
            comboPooledDataSource.setPassword(password);

            // set initial number of connections
            comboPooledDataSource.setInitialPoolSize(10);
            comboPooledDataSource.setMaxPoolSize(50);
            long start = System.currentTimeMillis();
            for (int i = 0; i < 5000; i++) {
                Connection connection = comboPooledDataSource.getConnection();
//                System.out.println("Connection Succeed!");
                connection.close();
            }
            long end = System.currentTimeMillis();
            System.out.println(end - start);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void testC3P0_02() throws Exception {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("mySource");
        Connection connection = comboPooledDataSource.getConnection();
        System.out.println("ok");
        connection.close();
    }

}
