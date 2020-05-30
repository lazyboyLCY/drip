package com.li.drip.service.impl;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.li.drip.dao.PublicArticleDao;
import com.li.drip.entity.Article;
import com.li.drip.service.PublicArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author LiChenYang
 * @date 2020-05-30 20:10
 */
@Service
public class PublicArticleServiceImpl implements PublicArticleService {
    @Autowired
    PublicArticleDao publicArticleDao;
    @Override
    public Boolean saveArticle(Article article, HttpServletRequest request) {
        //得到session
       article.setUsername((String) request.getSession().getAttribute("username"));
        Date date = new Date();
        article.setCreateTime(date);
        return publicArticleDao.saveArticle(article);
    }

    @Override
    public Boolean deleteArticle(Article article) {
        return publicArticleDao.deleteArticle(article.getId());
    }

    @Override
    public List<Article> searchArticle(Article article) {
        return publicArticleDao.searchArticle(article);
    }
}
