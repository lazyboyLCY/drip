package com.li.drip.service.impl;

import com.li.drip.dao.PublicArticleDao;
import com.li.drip.entity.Article;
import com.li.drip.service.PublicArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
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
       article.setCreateTime(new Date());
        return publicArticleDao.saveArticle(article);
    }

    @Override
    public Boolean deleteAreicle(Article article) {
        return publicArticleDao.deleteArticle(article.getId());
    }

    @Override
    public List<Article> searchAreicle(Article article, HttpServletRequest request) {
        article.setUsername((String) request.getSession().getAttribute("username"));
        return publicArticleDao.searchArticle(article);
    }
}
