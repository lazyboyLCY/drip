package com.li.drip.controller;

import com.li.drip.entity.DynamicMood;
import com.li.drip.service.DynamicmoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/dynamicmood")
public class DynamicmoodController {
    @Autowired
    DynamicmoodService dynamicmoodService;

    @RequestMapping("/testdynamicmood")
    public ModelAndView testdynamicmood(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("dynamicmood");
        String username= (String) request.getSession().getAttribute("username");
        mv.addObject("username",username);
        return mv;
    }
    @ResponseBody
    @RequestMapping("/adddynamicmood")
    public boolean adddynamicmood(@RequestBody DynamicMood dynamicMood, HttpServletRequest request) {
        return dynamicmoodService.add(dynamicMood,request);
    }

    @RequestMapping("/searchdynamicmood")
    public ModelAndView searchdynamicmood(HttpServletRequest request){
        ModelAndView mv = new ModelAndView("dynamicmood");
        String username= (String) request.getSession().getAttribute("username");
        List<DynamicMood> dm=dynamicmoodService.search(username);
        mv.addObject("list", dm);
        mv.addObject("username",username);
        return mv;
    }
}
