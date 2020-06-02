package com.li.drip.controller;

import com.li.drip.dao.LoginDao;
import com.li.drip.entity.User;
import com.li.drip.service.LoginService;
import com.li.drip.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("login")//登录
public class LoginController {
    @Autowired
    RegisterService registerService;
    @Autowired
    LoginService loginService;

    @RequestMapping("dologin")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }
    @RequestMapping("checklogin")//检查用户名
    @ResponseBody
    public boolean login(@RequestBody User user,HttpServletRequest request){
        //查出该用户的用户名和密码

        boolean login = loginService.Login(user);
        if(login){
            HttpSession session = request.getSession();
            session.setAttribute("username",user.getUsername());
            session.setAttribute("password",user.getPassword());
            return true;
   }else{
            return false;
        }
    }
    @RequestMapping("/logout")
    public ModelAndView logout(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("login");
        HttpSession session=request.getSession();
        session.invalidate();
        return mv;
    }
}
