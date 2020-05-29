package com.li.drip.service.impl;

import cn.hutool.crypto.digest.DigestUtil;
import com.li.drip.dao.RegisterDao;
import com.li.drip.entity.User;
import com.li.drip.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    RegisterDao registerDao;

    @Override
    public boolean adduser(String username,String password) { //Service调用Dao层方法
        String md5Hex = DigestUtil.md5Hex(password);
        return registerDao.adduser(username,md5Hex);
    }

    @Override
    public boolean checkuser(User username) {
        if ((registerDao.checkuser(username)) >= 1) {
            return true; //已有用户名
        } else {
            return false;
        }
    }
    @Override
    public boolean addpersonaldata(User user) {
        return registerDao.addpersonaldata(user);
    }
}
