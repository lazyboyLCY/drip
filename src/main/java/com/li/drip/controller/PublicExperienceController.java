package com.li.drip.controller;

import com.li.drip.entity.Experience;
import com.li.drip.entity.Note;
import com.li.drip.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author LiKaiXin
 * @date 2020-05-31 14:30
 */
@Controller
@RequestMapping("experience")
public class PublicExperienceController {
    @Autowired
    private ExperienceService experienceService;
    @RequestMapping("saveExperience")
    @ResponseBody
    public Boolean saveExperience(@RequestBody Experience experience, HttpServletRequest request){
        return experienceService.saveExperience(experience,request);
    }
    @RequestMapping("deleteExperience")
    @ResponseBody
    public Boolean deleteExperience(@RequestBody Experience experience){
        return experienceService.deleteExperience(experience);
    }
    @RequestMapping("searchEexperience")
    @ResponseBody
    public List<Experience> searchExperience(@RequestBody Experience experience){
        return experienceService.searchExperience(experience);
    }

}
