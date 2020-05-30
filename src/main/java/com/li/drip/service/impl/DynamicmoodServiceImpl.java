package com.li.drip.service.impl;

import com.li.drip.dao.DynamicmoodDao;
import com.li.drip.entity.DynamicMood;
import com.li.drip.service.DynamicmoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class DynamicmoodServiceImpl implements DynamicmoodService {
    @Autowired
    DynamicmoodDao dynamicmoodDao;
    DynamicMood dynamicMood;
    @Override
    public boolean add(DynamicMood dynamicMood,HttpServletRequest request) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date date = new Date();
        String data = simpleDateFormat.format(date);
        String username= (String) request.getSession().getAttribute("username");

        dynamicMood.setSendtime(data);
        dynamicMood.setUsername(username);
        System.out.println("data:"+data+"username:"+username+"title:"+dynamicMood.getTitle()+"message"+dynamicMood.getMessage());
        return dynamicmoodDao.add(dynamicMood);
    }
    @Override
    public List<DynamicMood> search(String username){
        List<DynamicMood> DM =dynamicmoodDao.search(username);
         return DM ;
    }
}
