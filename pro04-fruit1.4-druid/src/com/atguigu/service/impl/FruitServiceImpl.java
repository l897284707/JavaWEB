package com.atguigu.service.impl;


import com.atguigu.dao.FruitDao;
import com.atguigu.dao.impl.FruitDaoImpl;
import com.atguigu.moudle.Fruit;
import com.atguigu.service.FruitService;

import java.sql.SQLException;
import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-15
 */
public class FruitServiceImpl implements FruitService {
    static FruitDao fruitDao = new FruitDaoImpl();
    @Override
    public List<Fruit> findAll() {

        List<Fruit> all = fruitDao.findAll();
        return all;
    }


    @Override
    public Fruit findById(int fid) throws SQLException {
        Fruit byId = fruitDao.findById(fid);
        return byId;
    }

    @Override
    public int add(Fruit fruit) throws SQLException {
        int add = fruitDao.add(fruit);
        return add;
    }

    @Override
    public int update(int fid) {
        return 0;
    }

    @Override
    public int delById(int fid) {
        return 0;
    }
}
