package com.li.drip.controller;

import com.li.drip.entity.DynamicMood;
import com.li.drip.entity.Experience;
import com.li.drip.entity.Note;
import com.li.drip.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author LiKaiXin
 * @date 2020-05-31 14:30
 */
@Controller
@RequestMapping("msgboard")
public class PublicExperienceController {
    @Autowired
    private ExperienceService experienceService;

    @RequestMapping("testmsgboard")
    public ModelAndView testdynamicmood(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("msgboard");
        String username= (String) request.getSession().getAttribute("username");
        mv.addObject("username",username);
        return mv;
    }

    @RequestMapping("saveMessage")
    @ResponseBody
    public Boolean saveExperience(@RequestBody Experience experience, HttpServletRequest request){
        return experienceService.saveExperience(experience,request);
    }
    @RequestMapping("deleteMessage")
    @ResponseBody
    public Boolean deleteExperience(@RequestBody Experience experience){
        return experienceService.deleteExperience(experience);
    }
    @RequestMapping("searchMessage")
    @ResponseBody
    public ModelAndView searchExperience(Experience experience,HttpServletRequest request){
        ModelAndView mv = new ModelAndView("msgboard");
        String username= (String) request.getSession().getAttribute("username");
        experienceService.searchExperience(experience);
        List<Experience> dm=experienceService.searchExperience(experience);
        mv.addObject("list", dm);
        mv.addObject("username",username);
        return mv;
    }
}
