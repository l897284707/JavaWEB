package com.atguigu.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.sun.org.apache.xpath.internal.operations.Or;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author LiJH
 * @date 2022-12-11
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
}
