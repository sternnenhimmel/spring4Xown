package com.leon.spring.service;

import com.leon.spring.dao.LoginLogDao;
import com.leon.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Liol on 24/10/2017.
 */
@Service
public class UserService {
    private UserDao userDao;
    private LoginLogDao loginLogDao;

    @Autowired
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }

    @Autowired
    public void setLoginLogDao(LoginLogDao loginLogDao){
        this.loginLogDao=loginLogDao;
    }


}
