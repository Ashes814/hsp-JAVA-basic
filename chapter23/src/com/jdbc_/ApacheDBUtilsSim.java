package com.jdbc_;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author 欧欧
 * @version 1.0
 */
public class ApacheDBUtilsSim {
    @Test
    public void testADBSim() {
        Connection connection = null;
        String sql = "select * from baea_nests WHERE id > 60;";
        PreparedStatement preparedStatement = null;
        ResultSet set = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            set = preparedStatement.executeQuery();
            System.out.println("ok");
            connection.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
