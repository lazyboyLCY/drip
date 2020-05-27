package com.li.drip.service;

import com.li.drip.entity.PersonalData;
import com.li.drip.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface PersonalPageService {
    /**
     * 添加用户资料
     * @param personalData
     * @return
     */
    Boolean savePersonalData(PersonalData personalData);

    PersonalData searchPersonDate(User user);
}
