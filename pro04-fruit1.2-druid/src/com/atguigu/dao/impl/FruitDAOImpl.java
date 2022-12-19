package com.atguigu.dao.impl;

import com.atguigu.dao.FruitDAO;
import com.atguigu.module.Fruit;
import com.atguigu.utils.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-11
 */
public class FruitDAOImpl implements FruitDAO {
    static QueryRunner queryRunner = new QueryRunner(DruidUtil.getDataSource());
    @Override
    public List<Fruit> findAll() {
        try {
            String sql = "select * from fruit";
            List<Fruit> query = queryRunner.query(sql, new BeanListHandler<>(Fruit.class));
            return query;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Fruit findById(int fid) {
        try {
            String sql = "select * from fruit where fid=?";
            Fruit query = queryRunner.query(sql,new BeanHandler<>(Fruit.class), fid);
            return query;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(Fruit fruit) {
        String sql ="insert into fruit values(?,?,?,?,?)";
        try {
            int add = queryRunner.update(sql, fruit.getFid(), fruit.getFname(), fruit.getPrice(), fruit.getFcount(), fruit.getRemark());
            return add>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(Fruit fruit) {
        try {
            String sql = "update fruit set fname=?,price=?,fcount=?,remark=? where fid=?";
            int update = queryRunner.update(sql, fruit.getFname(), fruit.getPrice(), fruit.getFcount(), fruit.getRemark(), fruit.getFid());
            return update>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delById(int fid) {
        try {
            String sql ="delete from fruit where fid =?";
            int del = queryRunner.update(sql, fid);
            return del>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
