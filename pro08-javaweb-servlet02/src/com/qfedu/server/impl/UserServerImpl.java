package com.qfedu.server.impl;

import com.qfedu.dao.UserDao;
import com.qfedu.dao.impl.FruitDaoImpl;
import com.qfedu.dao.impl.UserDaoImpl;
import com.qfedu.moudle.User;
import com.qfedu.server.UserServer;

/**
 * @author LiJH
 * @date 2022-12-16
 */
public class UserServerImpl implements UserServer {

    @Override
    public User login(User user) {
        UserDaoImpl userDao = new UserDaoImpl();
        return userDao.login(user);
    }
}
