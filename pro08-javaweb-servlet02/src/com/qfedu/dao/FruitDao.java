package com.qfedu.dao;

import com.qfedu.moudle.Fruit;

import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-16
 */
public interface FruitDao {
    List<Fruit> findAll();
    Fruit findById(int fid);
    int add(Fruit fruit);
    int update(Fruit fruit);
    int delete(int fid);
}
