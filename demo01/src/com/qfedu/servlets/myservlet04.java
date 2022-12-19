package com.qfedu.servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author LiJH
 * @date 2022-12-15
 */
@WebServlet("/myservlet04")
public class myservlet04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //
        String username = req.getParameter("username");
        String age = req.getParameter("age");
        System.out.println(username+":"+age);
        System.out.println("mysevlet04");

        ServletInputStream inputStream = req.getInputStream();
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        String s = new String(bytes, 0, read);
        System.out.println(s);
        //响应数据
//        resp.setContentType("text/html;charset=utf-8");
//        resp.getWriter().write("响应数据");
        resp.getWriter().write("  {\"username\":\"admin\",\"age\":18}");

    }
}