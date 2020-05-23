package com.li.drip.dao;

import com.li.drip.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface RegisterDao {
    boolean adduser(String username, String password);
    int checkuser(User user);
}


