package com.connectPool;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author 欧欧
 * @version 1.0
 */
public class DreuidPoolTest {
    @Test
    public void testDruid() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter23/src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            Connection connection = dataSource.getConnection();

            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);


    }
}
