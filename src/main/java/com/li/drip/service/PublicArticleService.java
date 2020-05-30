package com.li.drip.service;

import com.li.drip.entity.Article;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface PublicArticleService {
     /**
      * @author LiChenYang
      * @date 2020-05-30
      * 添加文章
     */
     Boolean saveArticle(Article article, HttpServletRequest request);

     /**
      * @author LiChenYang
      * @date 2020-05-30
      * 删除文章
     */
     Boolean deleteAreicle(Article article);
     /**
      * @author LiChenYang
      * @date 2020-05-30
      * 查找文章
     */
     List<Article> searchAreicle(Article article, HttpServletRequest request);
}
