package com.hyw.mytest.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

/**
 * ClassName: MyFilter
 * Description:
 *
 * @Author jekny
 * @Create 2026/6/2 21:51
 * @Version 1.0
 */
@WebFilter("/*")
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        System.out.println("执行filter了");
        servletRequest.setCharacterEncoding("UTF-8");//filter是拦截器，在请求前就能执行到，如果要解决乱码问题可以在获取前端数据前在这里设置
        servletResponse.setCharacterEncoding("utf-8");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("执行完filter了");
    }
}
