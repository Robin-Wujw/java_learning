package com.robin.spring.pojo.controller;

import com.robin.spring.pojo.service.UserService;
import com.robin.spring.pojo.service.impl.UserServiceImpl;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-08-29 20:58
 */
public class UserController {

    private UserService userService;

    public UserService getUserService(){
        return userService;
    }

    public void setUserService(UserService userService){
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }

}
