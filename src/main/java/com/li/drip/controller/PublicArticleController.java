package com.li.drip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/publicarticle")
public class PublicArticleController {
    @RequestMapping("/testpublicarticle")
    public ModelAndView publicarticle(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("publicarticle");
        String username= (String) request.getSession().getAttribute("username");
        mv.addObject("username",username);
        return mv;
    }
    @RequestMapping("/myarticle")
    public ModelAndView myarticle(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("myarticle");
        String username= (String) request.getSession().getAttribute("username");
        mv.addObject("username",username);
        return mv;
    }


}
