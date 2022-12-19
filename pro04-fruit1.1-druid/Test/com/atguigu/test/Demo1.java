package com.atguigu.test;

import com.atguigu.utils.DruidUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * @author LiJH
 * @date 2022-12-11
 */
public class Demo1 {
    @Test
    public void test(){
        Connection connection = DruidUtils.getConnection();
        System.out.println(connection);
    }
}
