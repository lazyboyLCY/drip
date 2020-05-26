package com.li.drip.controller;

import com.li.drip.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/personalpage")
public class PersonalPageController {
    @RequestMapping("/testpersonalpage")
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("testlayui");
        String username= (String) request.getSession().getAttribute("username");
        mv.addObject("msg",username);
        return mv;
    }
    @RequestMapping("/personaldata")
    public ModelAndView personaldata(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("personaldata");
        String username= (String) request.getSession().getAttribute("username");
        mv.addObject("username",username);
        return mv;
    }
}
