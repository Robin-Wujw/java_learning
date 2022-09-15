package com.robin.controller;

import com.robin.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-09-05 22:51
 */
@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;
}
