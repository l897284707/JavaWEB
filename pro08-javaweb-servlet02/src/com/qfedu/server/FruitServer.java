package com.qfedu.server;

import com.qfedu.moudle.Fruit;

import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-16
 */
public interface FruitServer {
    List<Fruit> findAll();
    Fruit findById(int fid);
    int add(Fruit fruit);
    int update(int fid);
    int delete(int fid);
}
