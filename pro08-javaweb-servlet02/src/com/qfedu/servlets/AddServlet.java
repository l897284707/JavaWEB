package com.qfedu.servlets;

import com.qfedu.moudle.Fruit;
import com.qfedu.server.impl.FruitServerImpl;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author LiJH
 * @date 2022-12-17
 */
@WebServlet("/add")
public class AddServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String fname = req.getParameter("fname");
        String priceStr = req.getParameter("price");
        Integer price = Integer.parseInt(priceStr);
        String fcountStr = req.getParameter("fcount");
        Integer fcount = Integer.parseInt(fcountStr);
        String remark = req.getParameter("remark");
        Fruit fruit = new Fruit(0,fname,price,fcount,remark);
        FruitServerImpl fruitServer = new FruitServerImpl();
        int add = fruitServer.add(fruit);
        if (add>0){
            
        }


    }
}
