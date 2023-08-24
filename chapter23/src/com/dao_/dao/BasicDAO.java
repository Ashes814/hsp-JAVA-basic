package com.dao_.dao;

import com.dao_.utils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 欧欧
 * @version 1.0
 * develop BasicDAO
 */
public class BasicDAO<T> {
    private QueryRunner qr = new QueryRunner();
    public int update(String sql, Object... parameters) throws SQLException {
        Connection connection = null;
        connection = JDBCUtilsByDruid.getConnection();
        int update = qr.update(connection, sql, parameters);

        JDBCUtilsByDruid.close(connection);
        return update;
    }

    //return multiple object (ie. Result has multiple lines)
    public List<T> queryMultiply(String sql, Class<T> clazz, Object... parameters) throws SQLException   {
        Connection connection = null;
        try {

            connection = JDBCUtilsByDruid.getConnection();

            return qr.query(connection, sql, new BeanListHandler<T>(clazz), parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(connection);
        }
    }

    //query Single line
    public T querySingle(String sql, Class<T> clazz, Object... parameters) throws SQLException   {
        Connection connection = null;
        try {

            connection = JDBCUtilsByDruid.getConnection();

            return qr.query(connection, sql, new BeanHandler<T>(clazz), parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(connection);
        }



    }

    //query scalar data
    public Object queryScalar(String sql, Object... parameters) throws SQLException   {
        Connection connection = null;
        try {

            connection = JDBCUtilsByDruid.getConnection();

            return qr.query(connection, sql, new ScalarHandler(), parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(connection);
        }



    }

}

