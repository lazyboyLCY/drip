package com.li.drip.service;

import com.li.drip.entity.User;

public interface LoginService {
    /**
     * 登陆验证
     */
    boolean Login(User user);
}
