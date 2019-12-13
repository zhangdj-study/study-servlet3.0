package com.zdj.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhangdj
 * @date 2019/12/2
 */
public class SpiServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //获取MyServlet在ServletContext存的值
        ServletContext servletContext = getServletContext();
        Object username = servletContext.getAttribute("username");
        String s = username.toString();
        //因为getWriter()得到的是一个PrintWriter,它有一个缓冲区，缓冲区的默认编码是ISO-8859-1  这种编码是不支持中文的，所以必乱码。
        //我们的话可以通过设置缓冲区编码和设置浏览器打开编码，让它们两个编码一致，这样就可以解决中文乱码了。
        resp.setCharacterEncoding("UTF-8");
        //设置浏览器编码
        ServletOutputStream outputStream = resp.getOutputStream();
        resp.setHeader("Content-Type", "text/html;charset=UTF-8");
        //字节流输出
        outputStream.write(s.getBytes("UTF-8"));
        //字符流输出
//        resp.getWriter().write("spi hello" + s);
    }
}
