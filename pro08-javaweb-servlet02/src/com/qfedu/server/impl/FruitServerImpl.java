package com.qfedu.server.impl;

import com.qfedu.dao.FruitDao;
import com.qfedu.dao.impl.FruitDaoImpl;
import com.qfedu.moudle.Fruit;
import com.qfedu.server.FruitServer;

import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-16
 */
public class FruitServerImpl implements FruitServer {
    FruitDao fruitDao = new FruitDaoImpl();
    @Override
    public List<Fruit> findAll() {

        return fruitDao.findAll();
    }

    @Override
    public Fruit findById(int fid) {
        return fruitDao.findById(fid);
    }

    @Override
    public int add(Fruit fruit) {
        return fruitDao.add(fruit);
    }

    @Override
    public int update(int fid) {
        return 0;
    }

    @Override
    public int delete(int fid) {
        return 0;
    }
}
