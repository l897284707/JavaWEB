package com.qfedu.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @version 1.0
 * 公众号：Java架构栈
 * @Author: 卓不凡
 */
public class DruidPoolUtil {

    private static  DataSource dataSource ;
    //初始化连接
    static {

        try {
            //创建一个properties对象
            Properties properties = new Properties();
            //获得类加载器获取
            InputStream resourceAsStream =
                    DruidPoolUtil.class.getClassLoader().getResourceAsStream("druid.properties");
            properties.load(resourceAsStream);

            //获取连接  通过工厂去获取数据源
            dataSource= DruidDataSourceFactory.createDataSource(properties);
//            System.out.println(dataSource);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    //返回数据源
    public static DataSource getDataSource(){
        return dataSource;
    }

    //获得连接
    public static Connection getConnection(){
        Connection connection = null;
        try {
             connection = dataSource.getConnection();
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {
        Connection connection = getConnection();
    }
}
