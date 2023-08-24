package com.jdbc_;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
        ArrayList<Baea> list = new ArrayList<>();


        try {
            connection = JDBCUtilsByDruid.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            set = preparedStatement.executeQuery();
            System.out.println("ok");
            while (set.next()) {
                Baea baea = new Baea(set.getInt("id"),
                                    set.getDouble("lat_y_dd"),
                                    set.getDouble("long_x_dd"),
                                    set.getString("status"),
                                    set.getInt("nest_id"));
                list.add(baea);

            }
            System.out.println(list);
            connection.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
