package com.atguigu.gongju;

import com.atguigu.module.Fruit;
import com.atguigu.util.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-10
 */
public class FruitDAOImpl {
  static    QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
    public static void  Add() throws SQLException {
        String sql = "insert into fruit (fid,fname,price,fcount,remark)values(?,?,?,?,?) ";
        int update = queryRunner.update(sql, 20, "苹果2", 10, 50, "五");
        System.out.println(update>0?"添加成功":"添加失败");
    }
    public static void Dele() throws SQLException {
        String sql = "delete from fruit where fname=?";
        int del = queryRunner.update(sql, "苹果2");
        System.out.println(del>0?"删除成功":"删除失败");
    }
    public static void Update() throws SQLException {
        String sql = "update fruit set fname=? where fname=?";
        int update = queryRunner.update(sql,"苹果","苹果2");
        System.out.println(update>0?"修改成功":"修改失败");
    }
    static List<Fruit> arr = new ArrayList<>();
    public static List<Fruit> findById() throws SQLException {
        String sql = "select * from fruit where fname=?";
        Fruit query = queryRunner.query(sql, "苹果",new BeanHandler<>(Fruit.class));
        arr.add(query);
        return arr;
    }
    public static List<Fruit> findAll() throws SQLException {
        String sql = "select * from fruit";
        List<Fruit> query = queryRunner.query(sql, new BeanListHandler<>(Fruit.class));
        return query;

    }
}
