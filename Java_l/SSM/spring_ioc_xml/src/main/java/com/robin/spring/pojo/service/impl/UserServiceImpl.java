package com.robin.spring.pojo.service.impl;

import com.robin.spring.pojo.dao.UserDao;
import com.robin.spring.pojo.service.UserService;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-08-29 21:01
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
