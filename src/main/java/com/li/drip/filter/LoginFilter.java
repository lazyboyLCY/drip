package com.li.drip.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import com.li.drip.service.LoginService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

//配置拦截路径
@WebFilter(filterName = "loginfilter",urlPatterns = {"/personalpage/*"}) //设置需要过滤的路径 "/controller/*"
public class LoginFilter implements Filter {
    @Autowired
    LoginService loginService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

/*
        String servletPath =request.getServletPath();
        servletPath=StringUtils.remove(servletPath,"/register/");
        System.out.println("servletPath:"+servletPath);

 */
        String uri=request.getRequestURI();
//        uri=StringUtils.remove(uri,"/register/");
        System.out.println("uri:"+request.getRequestURI());

        String[] noNeedAuthPage = new String[]{ //放行的 "/Controller/方法"
                "/register/testregister",
                "/register/checkuser",
                "/login/dologin",
                ""};


        if (uri.startsWith("/")) {
            if (!Arrays.asList(noNeedAuthPage).contains(uri)) { //需要被拦截的
                String username = (String) request.getSession().getAttribute("username");
                System.out.println(username);
                if (null == username) {
                    response.sendRedirect("/login/dologin");
                    return;
                }
            }
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

}
