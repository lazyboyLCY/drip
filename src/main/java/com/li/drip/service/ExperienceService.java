package com.li.drip.service;

import com.li.drip.entity.Experience;
import com.li.drip.entity.Note;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author LiKaiXin
 * @date 2020-05-31 14:52
 */
public interface ExperienceService {
    Boolean saveExperience(Experience experience, HttpServletRequest request);
    Boolean deleteExperience(Experience experience);
    List<Experience> searchExperience(Experience experience);
}
