package com.robin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-09-01 19:35
 * 查询所有的用户信息 ---> /user  -->get
 * 根据id查询用户信息 ---> /user/1  -->get
 * 添加用户信息 ---> /user  -->post
 * 修改用户信息 ---> /user  -->put
 * 删除用户信息 ---> /user  -->delete
 *
 * 由于浏览器只支持发送get和post方式的请求，那么该如何发送put和delete请求呢？
 * SpringMVC 提供了 HiddenHttpMethodFilter 帮助我们将 POST 请求转换为 DELETE 或 PUT 请求
 * HiddenHttpMethodFilter 处理put和delete请求的条件：
 * a>当前请求的请求方式必须为post
 * b>当前请求必须传输请求参数_method
 * 满足以上条件，HiddenHttpMethodFilter 过滤器就会将当前请求的请求方式转换为请求参数
 * _method的值，因此请求参数_method的值才是最终的请求方式
 */
@Controller
public class TestRestController {

    @GetMapping(value = "/user")
    public String getAllUser(){
        System.out.println("查询所有的用户信息 ---> /user  -->get");
        return "success";
    }
    @GetMapping(value = "/user/{id}")
    public String getUserById(@PathVariable("id") Integer id){
        System.out.println("根据id查询用户信息 ---> /user/"+id+"-->get");
        return "success";
    }
    @PostMapping(value = "/user")
    public String insertUser(){
        System.out.println("添加用户信息 ---> /user  -->post");
        return "success";
    }
    @PutMapping(value = "/user")
    public String updateUser(){
        System.out.println("修改用户信息 ---> /user -->put");
        return "success";
    }
    @DeleteMapping(value = "/user/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        System.out.println("删除用户信息 ---> /user/"+id+"-->delete");
        return "success";
    }
}
