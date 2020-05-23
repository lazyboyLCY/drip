package com.li.drip.service;

import com.li.drip.entity.User;

public interface RegisterService {
    boolean adduser(String username,String password);
    boolean checkuser(User user);
}
