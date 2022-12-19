package com.atguigu.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author LiJH
 * @date 2022-12-11
 */
public class DruidUtils {
    private static DataSource dataSource;
    static {
        try {
            Properties pros = new Properties();
            InputStream is = DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            pros.load(is);
            dataSource = DruidDataSourceFactory.createDataSource(pros);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static DataSource getDataSource(){
        return dataSource;
    }
    public static Connection getConnection(){
        try {
            Connection conn = dataSource.getConnection();
            return conn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
