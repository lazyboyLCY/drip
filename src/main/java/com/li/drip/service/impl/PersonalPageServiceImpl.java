package com.li.drip.service.impl;

import com.li.drip.dao.PersonalPageDao;
import com.li.drip.entity.PersonalData;
import com.li.drip.entity.User;
import com.li.drip.service.PersonalPageService;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonalPageServiceImpl implements PersonalPageService {
    @Autowired
    PersonalPageDao personalPageDao;
    @Override
    public Boolean savePersonalData(PersonalData personalData) {
        if(personalData.getId()==null){
            //如果id为null就插入数据库
            Integer integer = personalPageDao.savePersonalData(personalData);
            if(integer>0){
                return true;
            }else{
                return false;
            }
        }else{
            Integer integer = personalPageDao.updatePersonalData(personalData);
            if(integer>0){
                return true;
            }else{
                return false;
            }
        }
    }

    @Override
    public PersonalData searchPersonDate(User user) {
        return personalPageDao.searchPersonalDate(user);
    }
}
