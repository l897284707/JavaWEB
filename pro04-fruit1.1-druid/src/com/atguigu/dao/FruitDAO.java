package com.atguigu.dao;

import com.atguigu.module.Fruit;

import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-11
 */
public interface FruitDAO {
    List<Fruit> findAll(String sql);
    List<Fruit> findById(String sql,Fruit fruit);
    boolean add(String sql,Fruit fruit);
    boolean updateById(String sql,Fruit fruit);
    boolean delById(String sql,Fruit fruit);
}
