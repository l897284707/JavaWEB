package com.atguigu.web;

import com.atguigu.module.Fruit;
import com.atguigu.service.impl.FruitServiceImpl;
import com.atguigu.util.DruidUtils;

import java.sql.Connection;
import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-11
 */
public class FruitApp {
    public static void main(String[] args) throws Exception {
        Connection connection = DruidUtils.getConnection();
        System.out.println(connection);
    }

    private static void add() {
        FruitServiceImpl fruitService = new FruitServiceImpl();
        List<Fruit> all = fruitService.findAll();
        all.forEach(System.out::println);
    }
}
