package com.li.drip.dao;

import com.li.drip.entity.PersonalData;
import com.li.drip.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalPageDao {
    /**
     * 添加用户信息
     * @param personalData
     * @return
     */
    Integer savePersonalData(PersonalData personalData);

    /**
     * 修改用户信息
     * @param personalData
     * @return
     */
    Integer updatePersonalData(PersonalData personalData);
    /**
     * 查询用户信息
     */
    PersonalData searchPersonalDate(User user);
}
