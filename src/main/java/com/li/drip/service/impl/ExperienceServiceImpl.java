package com.li.drip.service.impl;

import com.li.drip.dao.ExperienceDao;
import com.li.drip.entity.Experience;
import com.li.drip.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author LiKaiXin
 * @date 2020-05-31 14:52
 */
@Service
public class ExperienceServiceImpl implements ExperienceService {
    @Autowired
    private ExperienceDao experienceDao;

    @Override
    public Boolean saveExperience(Experience experience, HttpServletRequest request) {
        experience.setUsername((String) request.getSession().getAttribute("username"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date data = new Date();//创建时间对象
        String date = simpleDateFormat.format(data);
        experience.setCreateTime(date);
        return experienceDao.saveExperience(experience);
    }

    @Override
    public Boolean deleteExperience(Experience experience) {
        return experienceDao.deleteExperience(experience.getId());
    }

    @Override
    public List<Experience> searchExperience(Experience experience) {
        return experienceDao.searchExperience(experience);
    }
}
