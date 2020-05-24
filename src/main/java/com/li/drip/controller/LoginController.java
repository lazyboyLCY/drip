package com.li.drip.controller;

import com.li.drip.dao.LoginDao;
import com.li.drip.entity.User;
import com.li.drip.service.LoginService;
import com.li.drip.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
    @RequestMapping("login")//检查用户名
    @ResponseBody
    public boolean login(@RequestBody User user){
        //查出该用户的用户名和密码
        return(loginService.Login(user));
    }
}
