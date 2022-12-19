package com.atguigu.dao.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.moudle.User;
import com.atguigu.utils.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * @author LiJH
 * @date 2022-12-16
 */
public class UserDaoImpl implements UserDao {
    static QueryRunner queryRunner = new QueryRunner(DruidUtil.getDataSource());
    @Override
    public User login(User user) {
        try {
            String sql = "select * from user where username=? and password=?";
            User query = queryRunner.query(sql, new BeanHandler<>(User.class),user.getUsername(),user.getPassword());
            return query;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
