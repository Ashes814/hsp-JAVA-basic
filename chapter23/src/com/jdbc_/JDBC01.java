package com.jdbc_;

import org.postgresql.Driver;

import java.sql.*;

/**
 * @author 欧欧
 * @version 1.0
 */
public class JDBC01 {
    public static void testQuery() throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        String sql = "SELECT * FROM baea_nests WHERE id = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, 68);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            int id = rs.getInt(1);
            System.out.print(id + "\t");
            String string = rs.getString(6);
            System.out.print(string + "\n");
        }
        JDBCUtils.close(rs, preparedStatement, connection);

    }

    public static void main(String[] args) throws SQLException {
        testQuery();
    }

}
