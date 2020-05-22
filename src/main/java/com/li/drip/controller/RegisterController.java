package com.li.drip.controller;

import com.li.drip.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("register")//注册
public class RegisterController {
    @Autowired
    RegisterService registerService;


    @RequestMapping("doregister")//测试注册
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("register");
        return mv;
    }

    @RequestMapping("r_success")//可以注册
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("register");
        return mv;
    }

    @RequestMapping("doregister")//注册失败
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("register");
        return mv;
    }

    @RequestMapping("checkuser")//检查用户名
    public String checkuser(@RequestParam(value = "username")String username){
        if (registerService.checkuser(username)==false){ //该用户名未注册
            return "redirect:/register/";
        }else {
            return "redirect:/register/该用户名已注册";
        }
    }

    @RequestMapping("adduser")//添加用户
    private String adduser(@RequestParam(value="username")String username,@RequestParam(value="password")String password){ //接收增加的数据
        registerService.adduser(username, password);
        return "redirect:/login/dologin";
    }




}
