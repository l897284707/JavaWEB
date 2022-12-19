package com.atguigu.dao;

import com.atguigu.module.Fruit;

import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-11
 */
public interface FruitDAO {
    List<Fruit> findAll();
    Fruit findById(int fid);
    boolean add(Fruit fruit);
    boolean update(Fruit fruit);
    boolean delById(int fid);
}
