package com.li.drip.controller;

import com.li.drip.entity.Experience;
import com.li.drip.entity.Read;
import com.li.drip.service.PublicReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author LiKaiXin
 * @date 2020-05-31 15:26
 */
@Controller
@RequestMapping("read")
public class PublicReadController {
    @Autowired
    private PublicReadService publicReadService;
    @RequestMapping("saveRead")
    @ResponseBody
    public Boolean saveRead(@RequestBody Read read, HttpServletRequest request){
        return publicReadService.saveRead(read,request);
    }
    @RequestMapping("deleteRead")
    @ResponseBody
    public Boolean deleteRead(@RequestBody Read read){
        return publicReadService.deleteRead(read);
    }
    @RequestMapping("searchRead")
    @ResponseBody
    public List<Read> searchRead(@RequestBody Read read){
        return publicReadService.searchRead(read);
    }
}
