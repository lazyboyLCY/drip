package com.li.drip.dao;

import com.li.drip.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao {
int searchUser(User user);
}
