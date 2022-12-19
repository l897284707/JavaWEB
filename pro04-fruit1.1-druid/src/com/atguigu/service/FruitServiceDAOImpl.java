package com.atguigu.service;

import com.atguigu.dao.FruitDAO;
import com.atguigu.dao.impl.FruitDAOImpl;
import com.atguigu.module.Fruit;

import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-11
 */
public class FruitServiceDAOImpl implements FruitServiceDAO{
    private static FruitDAO fruitDAO = new FruitDAOImpl();
    @Override
    public List<Fruit> findAll(String sql) {
        List<Fruit> all = fruitDAO.findAll(sql);
        return all;
    }

    @Override
    public List<Fruit> findById(String sql, Fruit fruit) {
        List<Fruit> byId = fruitDAO.findById(sql, fruit);
        return byId;
    }

    @Override
    public boolean add(String sql, Fruit fruit) {
        boolean add = fruitDAO.add(sql, fruit);
        return add;
    }

    @Override
    public boolean updateById(String sql, Fruit fruit) {
        boolean update = fruitDAO.updateById(sql, fruit);
        return update;
    }

    @Override
    public boolean delById(String sql, Fruit fruit) {
        boolean b = fruitDAO.delById(sql, fruit);
        return b;
    }
}
