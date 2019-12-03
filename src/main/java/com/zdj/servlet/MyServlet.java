package com.zdj.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhangdj
 * @date 2019/12/2
 * servlet3.0开始，可以使用java注解的形式来代替web.xml。
 */
@WebServlet(value = {"/hello"})
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        System.out.println("-------------doGet");
        resp.getWriter().write("hello");
    }

}
