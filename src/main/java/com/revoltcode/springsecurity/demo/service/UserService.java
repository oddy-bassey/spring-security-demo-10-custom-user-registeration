package com.revoltcode.springsecurity.demo.service;

import com.revoltcode.springsecurity.demo.entity.User;
import com.revoltcode.springsecurity.demo.user.CrmUser;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByUserName(String userName);

    void save(CrmUser crmUser);
}
