package com.li.drip.controller;

import com.li.drip.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("login")//登录
public class LoginController {
    @Autowired
    RegisterService registerService;


    @RequestMapping("dologin")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }

//    @RequestMapping("adduser")//添加用户
//    private String adduser(@RequestParam(value="username")String username,@RequestParam(value="password")String password){ //接收增加的数据
//        registerService.adduser(username, password);
//        return "redirect:/register/index";
//    }




}
