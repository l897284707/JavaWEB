package com.atguigu.servlets;

import com.atguigu.dao.FruitDao;
import com.atguigu.dao.impl.FruitDaoImpl;
import com.atguigu.moudle.Fruit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author LiJH
 * @date 2022-12-15
 */
@WebServlet("/add")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fname = req.getParameter("fname");
        String priceStr = req.getParameter("price");
        Integer price = Integer.parseInt(priceStr);
        String count = req.getParameter("fcount");
        Integer fcount = Integer.parseInt(count);
        String remark = req.getParameter("remark");
        FruitDao dao = new FruitDaoImpl();
        try {
            int add = dao.add(new Fruit(0, fname, price, fcount, remark));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("添加成功");
    }
}
