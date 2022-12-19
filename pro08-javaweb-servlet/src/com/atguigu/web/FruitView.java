package com.atguigu.web;

import com.atguigu.moudle.Fruit;
import com.atguigu.service.impl.FruitServiceImpl;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 * @author LiJH
 * @date 2022-12-15
 */
public class FruitView {
    static Scanner input = new Scanner(System.in);
    static FruitServiceImpl fruitService = new FruitServiceImpl();
    @Test
    public void test1() {
        List<Fruit> all = fruitService.findAll();
        all.forEach(System.out::println);
    }
    @Test
    public void test2() throws SQLException {
        String byid = byid();
        System.out.println("添加成功！");
    }

    private String byid() throws SQLException {
        Fruit fruit = new Fruit();
        System.out.println("请输入水果名称：");
        fruit.setFname(input.next());
        System.out.println("请输入水果价格：");
        fruit.setPrice(input.nextInt());
        System.out.println("请输入水果库存：");
        fruit.setFcount(input.nextInt());
        System.out.println("请输入水果备注：");
        fruit.setRemark(input.next());
        int add = fruitService.add(fruit);
        return add>1?"添加成功":"添加失败";
    }

}
