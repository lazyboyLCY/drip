package com.li.drip.dao;

import com.li.drip.entity.Experience;
import com.li.drip.entity.Note;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExperienceDao {
    Boolean saveExperience(Experience experience);
    Boolean deleteExperience(Integer id);
    List<Experience> searchExperience(Experience experience);
}
