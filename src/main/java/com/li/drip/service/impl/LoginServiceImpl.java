package com.li.drip.service.impl;

import cn.hutool.crypto.digest.DigestUtil;
import com.li.drip.dao.LoginDao;
import com.li.drip.entity.User;
import com.li.drip.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginDao loginDao;
    @Override
    public boolean Login(User user) {
        String md5Hex = DigestUtil.md5Hex(user.getPassword());
        user.setPassword(md5Hex);
        int i = loginDao.searchUser(user);
        if(i>0){
            //如果有用户匹配
            return true;
        }else{
            return false;
        }
    }


}
