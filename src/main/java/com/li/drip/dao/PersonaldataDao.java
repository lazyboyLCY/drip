package com.li.drip.dao;

import com.li.drip.entity.PersonalData;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonaldataDao {
    PersonalData search(String username); //查找用户资料
    boolean update(String username,String data);
}
