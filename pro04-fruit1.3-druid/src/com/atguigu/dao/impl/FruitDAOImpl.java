package com.atguigu.dao.impl;

import com.atguigu.dao.FruitDAO;
import com.atguigu.module.Fruit;
import com.atguigu.util.DruidUtils;
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
        return null;
    }

    @Override
    public int add(Fruit fruit) {
        return 0;
    }

    @Override
    public int delById(int fid) {
        return 0;
    }

    @Override
    public int update(int fid) {
        return 0;
    }
}
