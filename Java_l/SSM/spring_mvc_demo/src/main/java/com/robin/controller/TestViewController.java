package com.robin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-09-01 17:28
 */
@Controller
public class TestViewController {

    @RequestMapping("/test/view/thymeleaf")
    public String testThymeleafView(){
        return "success";
    }

    @RequestMapping("/test/view/forward")
    public String testInternalResourceView(){
        return "forward:/testSession";
    }
    @RequestMapping("/test/view/redirect")
    public String testRedirectView(){
        return "redirect:/testSession";
    }

}
