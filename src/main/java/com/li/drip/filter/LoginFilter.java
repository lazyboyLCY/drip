package com.li.drip.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

//配置拦截路径
@WebFilter(filterName = "loginfilter",urlPatterns = {"/*"})
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
//        String servletPath =request.getServletPath();
//        String uri=request.getRequestURI();
//        System.out.println("servletPath:"+request.getServletPath());
//        System.out.println("uri:"+request.getRequestURI());
//
//        //System.out.println("contextPath:"+request.getContextPath());
//        //System.out.println("contextPath2:"+request.getServletContext().getContextPath());
//        //System.out.println("pageInfo:"+request.getPathInfo());
//        //System.out.println("url:"+request.getRequestURL());
//        //System.out.println("realPath:"+req.getServletContext().getRealPath("/"));
//        String[] noNeedAuthPage = new String[]{ //不需要过滤的
//                "register/testregister",
//                "login/dologin",
//                ""};
//
//        if (uri.startsWith("/")) {
//
//            if (!Arrays.asList(noNeedAuthPage).contains(uri)) { //需要被拦截的
//                String username = (String) request.getSession().getAttribute("username");
//                if (null == username) {
//                    response.sendRedirect("login");
//                    return;
//                }
//            }
//        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

}
