package com.qfedu.dao.impl;

import com.qfedu.dao.UserDao;
import com.qfedu.model.User;
import com.qfedu.service.UserService;
import com.qfedu.utils.DruidPoolUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-12
 */
public class UserDaoImpl implements UserDao {
    private static QueryRunner queryRunner = new QueryRunner(DruidPoolUtil.getDataSource());

    @Override
    public User login(User user) {
        String sql = "select * from t_user where username=? and password=?";
        try {
            User query = queryRunner.query(sql, new BeanHandler<>(User.class), user.getUsername(), user.getPassword());
            return query;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
