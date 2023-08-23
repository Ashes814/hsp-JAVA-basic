package com.jdbc_;

/**
 * @author 欧欧
 * @version 1.0
 */
public class TestJDBC {
    public static void main(String[] args) {
        JdbcInter mysqlJDBC = new MysqlJDBCImplement();
        mysqlJDBC.getConnection();
        mysqlJDBC.crud();
        mysqlJDBC.close();
    }
}
