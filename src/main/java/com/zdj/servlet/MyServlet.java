package com.zdj.servlet;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhangdj
 * @date 2019/12/2
 * @WebServlet 使用注解的方式向应用中添加servlet
 * servlet3.0开始，可以使用java注解的形式来代替web.xml。
 */
@WebServlet(value = {"/hello"})
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        System.out.println("hello doGet");
        //父类方法获取ServletContext
        ServletContext servletContext = getServletContext();
        //ServletContext中设置数据
        servletContext.setAttribute("username","用户名");
        //获取项目名
        String contextPath = servletContext.getContextPath();

        resp.getWriter().write(contextPath);
    }

}
