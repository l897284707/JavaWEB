package com.atguigu.service;

import com.atguigu.moudle.Fruit;

import java.sql.SQLException;
import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-15
 */
public interface FruitService {
    List<Fruit> findAll();
    Fruit findById(int fid) throws SQLException;
    int add(Fruit fruit) throws SQLException;
    int update(int fid);
    int delById(int fid);
}
