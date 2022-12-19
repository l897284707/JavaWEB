package com.atguigu.service.impl;

import com.atguigu.dao.FruitDAO;
import com.atguigu.dao.impl.FruitDAOImpl;
import com.atguigu.module.Fruit;
import com.atguigu.service.FruitService;

import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-11
 */
public class FruitServiceImpl implements FruitService {
    FruitDAO fruitDAO = new FruitDAOImpl();
    @Override
    public List<Fruit> findAll() {
        List<Fruit> all = fruitDAO.findAll();
        return all;
    }

    @Override
    public Fruit findById(int fid) {
        Fruit byId = fruitDAO.findById(fid);
        return byId;
    }

    @Override
    public boolean add(Fruit fruit) {
        boolean add = fruitDAO.add(fruit);
        return add;
    }

    @Override
    public boolean update(Fruit fruit) {
        boolean update = fruitDAO.update(fruit);
        return update;
    }

    @Override
    public boolean delById(int fid) {
        boolean b = fruitDAO.delById(fid);
        return b;
    }
}
