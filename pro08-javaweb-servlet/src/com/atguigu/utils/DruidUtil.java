package com.atguigu.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author LiJH
 * @date 2022-12-15
 */
public class DruidUtil {
    private static DataSource dataSource;
    static {
        try {
            Properties pros = new Properties();
            InputStream is = DruidUtil.class.getClassLoader().getResourceAsStream("druid.properties");
            pros.load(is);
            dataSource = DruidDataSourceFactory.createDataSource(pros);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static DataSource getDataSource(){
        return dataSource;
    }
    public static Connection getConnection()throws Exception{
       return dataSource.getConnection();
    }


}
