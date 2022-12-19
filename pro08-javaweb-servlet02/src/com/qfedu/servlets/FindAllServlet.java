package com.qfedu.servlets;

import com.qfedu.moudle.Fruit;
import com.qfedu.server.FruitServer;
import com.qfedu.server.impl.FruitServerImpl;

import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-16
 */
public class FindAllServlet {
    public static void main(String[] args) {
        FruitServer fruitServer = new FruitServerImpl();
        List<Fruit> all = fruitServer.findAll();
        all.forEach(System.out ::println);
    }
}
