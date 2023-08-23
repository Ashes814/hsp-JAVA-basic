package com.jdbc_;

/**
 * @author 欧欧
 * @version 1.0
 */
public interface JdbcInter {
    // connect
    public Object getConnection();
    // crud
    public void crud();
    // close
    public void close();
}
