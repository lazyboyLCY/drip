package com.li.drip.controller;

import com.li.drip.entity.User;
import com.li.drip.service.RegisterService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("register")//注册
public class RegisterController {
    @Autowired
    RegisterService registerService;

    @RequestMapping("testregister")//测试注册
    public ModelAndView testregister() {
        ModelAndView mv = new ModelAndView("register");
        return mv;
    }
    @RequestMapping("checkuser")//检查用户名
    @ResponseBody
    public String checkuser(@RequestBody User user){
        if (registerService.checkuser(user)==false){
            registerService.adduser(user.getUsername(), user.getPassword());
            return "false";//该用户名未注册
        }else {
            return "true";
        }
    }
}
