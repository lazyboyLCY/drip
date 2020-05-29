package com.li.drip.controller;

import com.li.drip.entity.PersonalData;
import com.li.drip.service.PersonalPageService;
import com.li.drip.service.PersonaldataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/personaldata")
public class PersonaldataController {
    @Autowired
    PersonaldataService personaldataService;

    @RequestMapping("/searchpersonaldata")
    public ModelAndView searchpersondata(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("personaldata");
        String username= (String) request.getSession().getAttribute("username");
        PersonalData pd=personaldataService.search(username);
        mv.addObject("username",username);
        mv.addObject("personaldata",pd);
        return mv;
    }
    @RequestMapping("/updatepersonaldata")

    @ResponseBody
    public boolean updatepersonaldata(@RequestBody String data,HttpServletRequest request){
        HttpSession session=request.getSession();
        String username = (String) session.getAttribute("username");
        String str= data.replace("\"", "");
        personaldataService.update(username,str);
        return true;
    }
}
