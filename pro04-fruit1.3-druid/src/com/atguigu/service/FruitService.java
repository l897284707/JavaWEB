package com.atguigu.service;

import com.atguigu.module.Fruit;

import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-11
 */
public interface FruitService {
    List<Fruit> findAll();
    Fruit findById(int fid);
    int add(Fruit fruit);
    int delById(int fid);
    int update(int fid);
}
