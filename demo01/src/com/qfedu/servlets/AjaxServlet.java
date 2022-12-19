package com.qfedu.servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author LiJH
 * @date 2022-12-16
 */
public class AjaxServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user1 = req.getParameter("username");
        String age1 = req.getParameter("age");
        int i = Integer.parseInt(age1);

        ServletInputStream inputStream = req.getInputStream();
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        String s = new String(bytes, 0, read);
        System.out.println(s);

    }
}
