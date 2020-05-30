package com.li.drip.service;

import com.li.drip.entity.DynamicMood;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface DynamicmoodService {
    boolean add(DynamicMood dynamicMood,HttpServletRequest request);//增加动态
    List<DynamicMood> search(String username);
}
