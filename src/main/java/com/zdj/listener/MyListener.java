package com.zdj.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author zhangdj
 * @date 2019/12/2
 *
 * @WebListener 注解向容器中添加监听器
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
