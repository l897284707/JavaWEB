package com.atguigu.service.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.impl.UserDaoImpl;
import com.atguigu.moudle.User;
import com.atguigu.service.UserService;

/**
 * @author LiJH
 * @date 2022-12-16
 */
public class UserServiceImpl implements UserService {
    @Override
    public User login(User user) {
        UserDao userDao = new UserDaoImpl();
        User login = userDao.login(user);
        System.out.println(login);
        return login;


    }
}
