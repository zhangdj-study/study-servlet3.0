package com.zdj.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author zhangdj
 * @date 2019/12/3
 */
public class SpiListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("-----SpiListener init");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("-----SpiListener destroy");
    }
}
