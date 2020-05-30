package com.li.drip.dao;

import com.li.drip.entity.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author LiChenYang
 * @date 2020-05-30 20:14
 */
@Repository
public interface PublicArticleDao {
    /**
     * @author LiChenYang
     * @date 2020-05-30
     * 添加文章
    */
    Boolean saveArticle(Article article);
    /**
     * @author LiChenYang
     * @date 2020-05-30
     * 删除文章
    */
    Boolean deleteArticle(Integer id);
    /**
     * @author LiChenYang
     * @date 2020-05-30
     * 查找文章
    */
    List<Article> searchArticle(Article article);
}
