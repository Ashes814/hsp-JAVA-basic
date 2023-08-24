package com.jdbc_;

import com.dao_.domain.Baea;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 欧欧
 * @version 1.0
 */
public class ApacheDBUtilsUse {
    @Test
    public void testQuery() throws SQLException { // return multi lines
        //1. get connection druid
        Connection connection = JDBCUtilsByDruid.getConnection();
        //2. Using DBUtils class and Interface, import related jar
        //3. create Query Runner
        QueryRunner queryRunner = new QueryRunner();
        //4.execute
        String sql = "select * from baea_nests WHERE id > ?;";
        // execute sql. get result set, encapsulating it to ArrayList
        // new BeanListHandler<>(Baea.class) Baea Object ----> ArrayList
        // 60 is for ?

        List<Baea> query = queryRunner.query(connection, sql, new BeanListHandler<>(Baea.class), 60);
        for (Baea baea: query) {
            System.out.println(baea );
        }

        // resultset and preparedStatemet will be closed in query, so we just need close connection
        JDBCUtilsByDruid.close(connection);


    }
}
