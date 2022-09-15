package com.robin.spring.test;

import com.robin.spring.controller.UserController;
import com.robin.spring.dao.UserDao;
import com.robin.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.Transient;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-08-29 22:28
 */
public class IOCByAnnotationTest {
    @Test
    public void test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean(UserController.class);
        System.out.println(userController);

        UserService userService = ioc.getBean(UserService.class);
        System.out.println(userService);

        UserDao userDao = ioc.getBean(UserDao.class);
        System.out.println(userDao);
    }
}
