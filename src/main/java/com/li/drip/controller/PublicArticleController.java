package com.li.drip.controller;

import com.li.drip.entity.Article;
import com.li.drip.service.PublicArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/publicarticle")
public class PublicArticleController {
    @Autowired
    private PublicArticleService publicArticleService;
    @RequestMapping("/testpublicarticle")
    public ModelAndView publicarticle(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("publicarticle");
        String username= (String) request.getSession().getAttribute("username");
        mv.addObject("username",username);
        return mv;
    }
    @RequestMapping("/myarticle")
    public ModelAndView myarticle(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("myarticle");
        String username= (String) request.getSession().getAttribute("username");
        mv.addObject("username",username);
        return mv;
    }
    /**
     * @author LiChenYang
     * @date 2020-05-30
     * 添加文章
    */
    @RequestMapping("saveArticle")
    @ResponseBody
    public Boolean saveArticle(@RequestBody Article article,HttpServletRequest request){
        return publicArticleService.saveArticle(article,request);
    }
    /**
     * @author LiChenYang
     * @date 2020-05-30
     * 删除文章
    */
    @RequestMapping("deleteAreicle")
    @ResponseBody
    public Boolean deleteAreicle(@RequestBody Article article){
        return publicArticleService.deleteAreicle(article);
    }
    /**
     * @author LiChenYang
     * @date 2020-05-30
     * 查找文章
    */
    @RequestMapping("searchAreicle")
    @ResponseBody
    public List<Article> searchAreicle(@RequestBody Article article,HttpServletRequest request){
        return publicArticleService.searchAreicle(article,request);
    }


}
