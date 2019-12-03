package com.zdj.initializer;

import com.zdj.facade.MyFacade;
import com.zdj.filter.SpiFilter;
import com.zdj.listener.MyListener;
import com.zdj.listener.SpiListener;
import com.zdj.servlet.SpiServlet;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.util.EnumSet;
import java.util.Set;

/**
 * @author zhangdj
 * @date 2019/12/2
 * 使用spi的机制向web容器中添加servlet
 *
 * @HandlesTypes 注解中的接口MyFacade 在web容器启动时，接口MyFacade的实现类都会被实例化
 */
@HandlesTypes(value = {MyFacade.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        for (Class clazz:c) {
            System.out.println("类型" + clazz.getCanonicalName());
        }

        //添加监听器
        System.out.println("MyServletContainerInitializer start");
        ctx.addListener(SpiListener.class);

        //注册servlet
        ServletRegistration.Dynamic servletRegistration = ctx.addServlet("spiServlet",new SpiServlet());
        servletRegistration.addMapping("/spiServlet");

        //注册Filter
        FilterRegistration.Dynamic filterRegistration = ctx.addFilter("spiFilter", SpiFilter.class);
        filterRegistration.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");
    }
}
