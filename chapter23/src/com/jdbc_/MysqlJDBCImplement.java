package com.jdbc_;

/**
 * @author 欧欧
 * @version 1.0
 */
public class MysqlJDBCImplement implements JdbcInter{
    @Override
    public Object getConnection() {
        System.out.println("mysql connection");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("crud");

    }

    @Override
    public void close() {
        System.out.println("close");
    }
}
