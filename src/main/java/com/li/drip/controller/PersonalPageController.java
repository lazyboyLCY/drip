package com.li.drip.controller;

import com.li.drip.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/personalpage")
public class PersonalPageController {
    User user;

    @RequestMapping("/testpersonalpage")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");

        return mv;
    }
//    @RequestMapping("/getuser")
//    public void getuser(HttpServletRequest request){ //得到登录的用户名和密码
//        HttpSession session = request.getSession();
//        session.setAttribute("username", user.getUsername()); //将username赋给session
//        session.setAttribute("password", user.getPassword()); //将password赋给session
//        System.out.println(user.getUsername());
//        System.out.println(user.getPassword());
//    }
}
