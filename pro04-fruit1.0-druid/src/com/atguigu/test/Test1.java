package com.atguigu.test;

import com.atguigu.gongju.FruitDAOImpl;
import com.atguigu.module.Fruit;

import java.sql.SQLException;
import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-10
 */
public class Test1 {
    public static void main(String[] args) throws SQLException {
        List<Fruit> all = FruitDAOImpl.findAll();
        all.forEach(System.out::println);
    }
}
