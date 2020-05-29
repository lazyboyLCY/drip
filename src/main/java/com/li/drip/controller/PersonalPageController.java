package com.li.drip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/personalpage")
public class PersonalPageController {
    @RequestMapping("/testpersonalpage")
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("personalpage");
        String username= (String) request.getSession().getAttribute("username");
        mv.addObject("msg",username);
        return mv;
    }
}
