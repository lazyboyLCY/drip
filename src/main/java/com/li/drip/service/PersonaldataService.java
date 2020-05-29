package com.li.drip.service;

import com.li.drip.entity.PersonalData;
import com.li.drip.entity.User;

import java.util.List;

public interface PersonaldataService {
    PersonalData search(String username);
    boolean update(String username,String data);
}
