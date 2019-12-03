package com.zdj.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author zhangdj
 * @date 2019/12/2
 */
@WebFilter(value = "/*")
public class MyFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter init");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyFilter doFilter");
        chain.doFilter(request,response);
    }

    public void destroy() {
        System.out.println("MyFilter destroy");
    }
}
