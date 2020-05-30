package com.li.drip.dao;

import com.li.drip.entity.DynamicMood;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Repository
public interface DynamicmoodDao {
    boolean add(DynamicMood dynamicMood); //增加动态心情
    List<DynamicMood> search(String username);
}
