package com.atguigu.dao.impl;

import com.atguigu.dao.FruitDao;
import com.atguigu.moudle.Fruit;
import com.atguigu.utils.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-15
 */
public class FruitDaoImpl implements FruitDao {
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
    public Fruit findById(int fid) throws SQLException {
        String sql = "select * from fruit";
        Fruit query = queryRunner.query(sql,new BeanHandler<>(Fruit.class));
        return query;
    }

    @Override
    public int add(Fruit fruit) {
        try {
            String sql = "insert into fruit values(0,?,?,?,?)";
            int add = queryRunner.update(sql, fruit.getFname(), fruit.getPrice(), fruit.getFcount(), fruit.getRemark());
            return add;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(int fid) {
        return 0;
    }

    @Override
    public int delById(int fid) {
        return 0;
    }
}