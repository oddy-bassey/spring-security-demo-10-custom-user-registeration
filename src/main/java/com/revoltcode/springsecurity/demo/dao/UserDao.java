package com.revoltcode.springsecurity.demo.dao;

import com.revoltcode.springsecurity.demo.entity.User;

public interface UserDao {

    User findByUserName(String userName);
    
    void save(User user);
    
}
