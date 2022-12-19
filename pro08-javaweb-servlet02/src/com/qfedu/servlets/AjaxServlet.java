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
 * @date 2022-12-16
 */
@WebServlet("/ajaxse")
public class AjaxServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        byte[] bytes = new byte[1024];
        ServletInputStream inputStream = req.getInputStream();
        int read = inputStream.read(bytes);
        String s = new String(bytes, 0, read);
        System.out.println(s);

    }
}
