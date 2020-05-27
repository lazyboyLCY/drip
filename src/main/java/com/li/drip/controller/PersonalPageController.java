package com.li.drip.controller;

import com.li.drip.entity.PersonalData;
import com.li.drip.entity.User;
import com.li.drip.service.PersonalPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/personalpage")
public class PersonalPageController {
    @Autowired
    PersonalPageService personalPageService;
    @RequestMapping("/testpersonalpage")
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("testlayui");
        String username= (String) request.getSession().getAttribute("username");
        mv.addObject("msg",username);
        return mv;
    }
    @RequestMapping("personaldata")
    public ModelAndView personaldata(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("personaldata");
        String username= (String) request.getSession().getAttribute("username");
        mv.addObject("username",username);
        return mv;
    }
    @RequestMapping("savePersonalData")
    @ResponseBody
    public Boolean savePersonalData(@RequestBody PersonalData personalData){
        return personalPageService.savePersonalData(personalData);
    }
    @RequestMapping("searchPersonDate")
    @ResponseBody
    public PersonalData searchPersonDate(@RequestBody User user){
        return personalPageService.searchPersonDate(user);
    }
}
