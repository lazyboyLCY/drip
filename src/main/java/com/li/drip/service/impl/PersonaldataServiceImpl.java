package com.li.drip.service.impl;

import com.li.drip.dao.PersonaldataDao;
import com.li.drip.entity.PersonalData;
import com.li.drip.service.PersonaldataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonaldataServiceImpl implements PersonaldataService {
    @Autowired
    PersonaldataDao personaldataDao;
    public PersonalData search(String username) {
        return  personaldataDao.search(username);
    }

    public boolean update(String username, String data) {
        personaldataDao.update(username,data);
        return false;
    }
}
