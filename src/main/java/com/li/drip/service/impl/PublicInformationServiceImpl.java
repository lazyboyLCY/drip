package com.li.drip.service.impl;

import com.li.drip.dao.PublicInformationDao;
import com.li.drip.entity.Information;
import com.li.drip.service.PublicInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author LiKaiXin
 * @date 2020-05-31 16:04
 */
@Service
public class PublicInformationServiceImpl implements PublicInformationService {
    @Autowired
    private PublicInformationDao publicInformationDao;
    @Override
    public Boolean saveInformation(Information information, HttpServletRequest request) {
        information.setUsername((String) request.getSession().getAttribute("username"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date data = new Date();//创建时间对象
        String date = simpleDateFormat.format(data);
        information.setCreateTime(date);
        return  publicInformationDao.saveInformation(information);

    }

    @Override
    public Boolean deleteInformation(Information information) {
        return publicInformationDao.deleteInformation(information.getId());
    }

    @Override
    public List<Information> searchInformation(Information information) {
        return publicInformationDao.searchInformation(information);
    }
}
