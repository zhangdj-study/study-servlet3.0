package com.zdj.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhangdj
 * @date 2019/12/2
 */
@WebListener
public class MyListener implements ServletContextListener {


    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("my listener initial");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("my listener destroy");
    }
}
