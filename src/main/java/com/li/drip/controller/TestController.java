package com.li.drip.controller;

import com.li.drip.entity.User;
import com.li.drip.service.LoginService;
import com.li.drip.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/test")//登录
public class TestController {

    @RequestMapping("/publicpage")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("publicpage");
        return mv;
    }
}
