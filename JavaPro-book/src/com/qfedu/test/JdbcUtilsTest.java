package com.qfedu.test;

import com.qfedu.util.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * @author LiJH
 * @date 2022-12-12
 */
public class JdbcUtilsTest {
    @Test
    public void test(){
        Connection connection = JdbcUtils.getConnection();
        System.out.println(connection);
        JdbcUtils.close(connection);
    }

}
