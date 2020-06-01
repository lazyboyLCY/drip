package com.li.drip.controller;

import com.li.drip.entity.Information;
import com.li.drip.entity.Read;
import com.li.drip.service.PublicInformationService;
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
 * @date 2020-05-31 15:59
 */
@Controller
@RequestMapping("information")
public class PublicInformationController {
    @Autowired
    private PublicInformationService publicInformationService;
    @RequestMapping("saveInformation")
    @ResponseBody
    public Boolean saveInformation(@RequestBody Information information, HttpServletRequest request){
        return publicInformationService.saveInformation(information,request);
    }
    @RequestMapping("deleteInformation")
    @ResponseBody
    public Boolean deleteInformation(@RequestBody Information information){
        return publicInformationService.deleteInformation(information);
    }
    @RequestMapping("searchInformation")
    @ResponseBody
    public ModelAndView searchInformation(Information information,HttpServletRequest request){
            ModelAndView mv = new ModelAndView("sendmessage");
            String username= (String) request.getSession().getAttribute("username");
            List<Information> dm=publicInformationService.searchInformation(information);
            mv.addObject("list", dm);
            mv.addObject("username",username);
            return mv;
        }
    }

