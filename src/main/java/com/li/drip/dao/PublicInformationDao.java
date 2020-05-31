package com.li.drip.dao;

import com.li.drip.entity.Experience;
import com.li.drip.entity.Information;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicInformationDao {
    Boolean saveInformation(Information information);
    Boolean deleteInformation(Integer id);
    List<Information> searchInformation(Information information);
}
