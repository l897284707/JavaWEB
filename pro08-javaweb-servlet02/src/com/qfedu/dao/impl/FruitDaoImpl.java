package com.qfedu.dao.impl;

import com.qfedu.dao.FruitDao;
import com.qfedu.moudle.Fruit;
import com.qfedu.util.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author LiJH
 * @date 2022-12-16
 */
public class FruitDaoImpl implements FruitDao {
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
        try {
            String sql = "select * from fruit where fid=?";
            Fruit query = queryRunner.query(sql, new BeanHandler<>(Fruit.class), fid);
            return query;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int add(Fruit fruit) {
        try {
            String sql = "insert into fruit values (0,?,?,?,?)";
            int update = queryRunner.update(sql,fruit.getFname(), fruit.getPrice(), fruit.getFcount(), fruit.getRemark());
            return update;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Fruit fruit) {
//        String sql = "update from fruit set fname= ? where fid=?";
//        queryRunner.update(sql,,fid);
        return 0;
    }

    @Override
    public int delete(int fid) {
        return 0;
    }
}
