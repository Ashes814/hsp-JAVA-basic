package com.jdbc_;

import org.postgresql.Driver;
import org.postgresql.shaded.com.ongres.scram.common.bouncycastle.pbkdf2.Strings;

import java.sql.*;

/**
 * @author 欧欧
 * @version 1.0
 */
public class JDBCResultSet {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        // sql user data
        int userId = 68;
        String pwd = "73";

        // using reflection to load Driver, more flexible, dynamic loading
        Class<?> cls = Class.forName("org.postgresql.Driver");
        Driver driver = (Driver) cls.newInstance();

        String url = "jdbc:postgresql://localhost:5432/sdb_course";
        String username = "zowcool";
        String password = "999814";
        Connection connection = DriverManager.getConnection(url, username, password);
        // 3.Execute SQL
//        String sql = "SELECT * FROM baea_nests WHERE id = '" + userId + "' AND nest_id = '" + pwd + "';";
        String sql = "SELECT * FROM baea_nests WHERE id = ?;";

        System.out.println(sql);
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "1 or '1' = '1'");
//        preparedStatement.setString(2, pwd);
        ResultSet rs = preparedStatement.executeQuery();
       while (rs.next()) {
//           System.out.println(rs.first());
           int id = rs.getInt(1);
           System.out.print(id + "\t");
           String string = rs.getString(6);
           System.out.print(string + "\n");
       }

        // 4.close
        rs.close();
        preparedStatement.close();
        connection.close();
    }
}
