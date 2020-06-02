package com.li.drip.service.impl;


import com.li.drip.dao.*;
import com.li.drip.entity.*;
import com.li.drip.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

public class TestServiceImpl implements TestService {
    @Autowired
    private PublicArticleDao publicArticleDao;
    @Autowired
    private PublicInformationDao publicInformationDao;
    @Autowired
    private PublicReadDao publicReadDao;
    @Autowired
    private ExperienceDao experienceDao;
    @Autowired
    private DynamicmoodDao dynamicmoodDao;
    @Override
    public AllParam searchAllParam() {
        AllParam allParam = new AllParam();
        allParam.setArticles(publicArticleDao.searchArticle(new Article()));
        String username =null;
        allParam.setDynamicMoods(dynamicmoodDao.search(username));
        allParam.setExperiences(experienceDao.searchExperience(new Experience()));
        allParam.setReads(publicReadDao.searchRead(new Read()));
        allParam.setInformations(publicInformationDao.searchInformation(new Information()));
        return allParam;
    }
}
