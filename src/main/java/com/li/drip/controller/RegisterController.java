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
    //加个注释合并一下
    @RequestMapping("checkuser")//检查用户名
    @ResponseBody
    public String checkuser(@RequestBody User user){
        if (registerService.checkuser(user)==false){
            adduser(user.getUsername(), user.getPassword());
            return "false";//该用户名未注册
        }else {
            return "true";
        }
    }

    @RequestMapping("r_fail")//注册失败
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("r_fail");
        return mv;
    }

    @RequestMapping("adduser")//添加用户
    private String adduser(@RequestParam(value="username")String username,@RequestParam(value="password")String password){ //接收增加的数据
        registerService.adduser(username, password);
        return "redirect:/login/dologin";
    }




}
