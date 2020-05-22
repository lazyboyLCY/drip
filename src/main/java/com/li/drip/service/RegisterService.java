package com.li.drip.service;

public interface RegisterService {
    boolean adduser(String username,String password);
    boolean checkuser(String username);
}
