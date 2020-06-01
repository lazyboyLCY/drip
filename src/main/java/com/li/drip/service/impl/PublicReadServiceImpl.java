package com.li.drip.service.impl;

import com.li.drip.dao.PublicReadDao;
import com.li.drip.entity.Read;
import com.li.drip.service.PublicReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author LiKaiXin
 * @date 2020-05-31 15:27
 */
@Service
public class PublicReadServiceImpl implements PublicReadService {
    @Autowired
    private PublicReadDao publicReadDao;
    @Override
    public Boolean saveRead(Read read, HttpServletRequest request) {
        read.setUsername((String) request.getSession().getAttribute("username"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date data = new Date();//创建时间对象
        String date = simpleDateFormat.format(data);
        read.setCreateTime(date);
        return publicReadDao.saveRead(read);
    }

    @Override
    public Boolean deleteRead(Read read) {
        return publicReadDao.deleteRead(read);
    }

    @Override
    public List<Read> searchRead(Read read) {
        return publicReadDao.searchRead(read);
    }
}
