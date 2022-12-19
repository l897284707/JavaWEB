package com.atguigu.service.impl;

import com.atguigu.dao.impl.FruitDAOImpl;
import com.atguigu.module.Fruit;
import com.atguigu.service.FruitService;

import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-11
 */
public class FruitServiceImpl implements FruitService {
    @Override
    public List<Fruit> findAll() {
        FruitDAOImpl fruitDAO = new FruitDAOImpl();
        List<Fruit> all = fruitDAO.findAll();
        return all;
    }

    @Override
    public Fruit findById(int fid) {
        return null;
    }

    @Override
    public int add(Fruit fruit) {
        return 0;
    }

    @Override
    public int delById(int fid) {
        return 0;
    }

    @Override
    public int update(int fid) {
        return 0;
    }
}
