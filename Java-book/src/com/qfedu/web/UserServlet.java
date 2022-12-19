package com.qfedu.web;

import com.qfedu.model.User;
import com.qfedu.service.UserService;
import com.qfedu.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author LiJH
 * @date 2022-12-12
 */
@WebServlet("/userServlet")
public class UserServlet extends BaseServlet {
    public void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = new UserServiceImpl();
        try {
            Map<String, String[]> map = req.getParameterMap();
            User user = new User();
            BeanUtils.populate(user, map);
            System.out.println(user);
            User user1 = userService.login(user);
            if (user1!=null){
                req.getRequestDispatcher("/pages/user/login_success.jsp").forward(req,resp);
            }else {
               req.setAttribute("msg","用户名或密码错误");
               req.setAttribute("username",user.getUsername());
               req.getRequestDispatcher("/pages/user/login.jsp").forward(req,resp);
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
