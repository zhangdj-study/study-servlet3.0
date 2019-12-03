package com.zdj.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author zhangdj
 * @date 2019/12/3
 *
 * 使用spi机制向容器中添加过滤器
 */
public class SpiFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("-----SpiFilter init");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("------SpiFilter doFilter");
        //放行
        chain.doFilter(request,response);
    }

    public void destroy() {
        System.out.println("-----SpiFilter destroy");
    }
}
