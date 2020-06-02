package com.li.drip.controller;

import com.li.drip.entity.AllParam;
import com.li.drip.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/personalpage")
public class PersonalPageController {
    @Autowired
    private TestService testService;
    @RequestMapping("/testpersonalpage")
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("personalpage");
        String username= (String) request.getSession().getAttribute("username");
        AllParam param = testService.searchAllParam();
        mv.addObject("paramarticles",param.getArticles());
        mv.addObject("paramdynamicmoods",param.getDynamicMoods());
        mv.addObject("parambooks",param.getReads());
        mv.addObject("parammessages",param.getExperiences());
        mv.addObject("paraminformation",param.getInformations());
        mv.addObject("msg",username);
        return mv;
    }
}
