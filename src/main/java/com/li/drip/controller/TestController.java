package com.li.drip.controller;

import com.li.drip.entity.AllParam;
import com.li.drip.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")//登录
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping("/testpage")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("sharebook");
        return mv;
    }
    @RequestMapping("searchAllParam")
    @ResponseBody
    public AllParam searchAllParam(){
        return testService.searchAllParam();
    }
}
