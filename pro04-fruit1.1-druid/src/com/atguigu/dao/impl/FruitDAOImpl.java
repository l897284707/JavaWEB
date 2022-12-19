package com.atguigu.dao.impl;

import com.atguigu.dao.FruitDAO;
import com.atguigu.module.Fruit;
import com.atguigu.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-11
 */
public class FruitDAOImpl implements FruitDAO {
    static QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());

    @Override
    public List<Fruit> findAll(String sql) {
        try {
            List<Fruit> query = queryRunner.query(sql, new BeanListHandler<>(Fruit.class));
            return query;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Fruit> findById(String sql,Fruit fruit) {
        try {
            List<Fruit> query = queryRunner.query(sql,fruit.getFid(),new BeanListHandler<>(Fruit .class));
            return query;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(String sql,Fruit fruit) {
        int update = 0;
        try {
            update = queryRunner.update(sql,fruit.getFid(),fruit.getFname(),fruit.getPrice(),fruit.getFcount(),fruit.getRemark());
            return update>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateById(String sql,Fruit fruit) {
        try {
            int update = queryRunner.update(sql, fruit.getFid(), fruit.getFname(), fruit.getPrice(), fruit.getFcount(), fruit.getRemark());
            return update>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public boolean delById(String sql,Fruit fruit) {
        try {
            int update = queryRunner.update(sql, fruit.getFid());
            return update > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
