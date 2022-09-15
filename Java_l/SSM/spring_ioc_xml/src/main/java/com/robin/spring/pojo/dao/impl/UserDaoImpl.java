package com.robin.spring.pojo.dao.impl;

import com.robin.spring.pojo.dao.UserDao;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-08-29 21:01
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("保存成功!");
    }
}
