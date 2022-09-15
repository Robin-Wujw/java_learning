package com.robin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-08-31 17:58
 *
 * @RequestMapping标识一个类：设置映射请求的请求路径的初始信息
 * @RequestMapping标识一个方法：设置映射请求请求路径的具体信息
 *
 * @RequestMapping注解的method属性通过请求的请求方式（get或post）匹配请求映射
 * @RequestMapping注解的method属性是一个RequestMethod类型的数组，表示该请求映射能够匹配
 * 多种请求方式的请求
 * 若当前请求的请求地址满足请求映射的value属性，但是请求方式不满足method属性，则浏览器报错
 * 405：Request method 'POST' not supported
 * 1、对于处理指定请求方式的控制器方法，SpringMVC中提供了@RequestMapping的派生注解
 * 处理get请求的映射-->@GetMapping
 * 处理post请求的映射-->@PostMapping
 * 处理put请求的映射-->@PutMapping
 * 处理delete请求的映射-->@DeleteMapping
 * 2、常用的请求方式有get，post，put，delete
 * 但是目前浏览器只支持get和post，若在form表单提交时，为method设置了其他请求方式的字符
 * 串（put或delete），则按照默认的请求方式get处理
 * 若要发送put和delete请求，则需要通过spring提供的过滤器HiddenHttpMethodFilter，在
 * RESTful部分会讲到
 * @RequestMapping注解的params属性通过请求的请求参数匹配请求映射
 * @RequestMapping注解的params属性是一个字符串类型的数组，可以通过四种表达式设置请求参数
 * 和请求映射的匹配关系
 * "param"：要求请求映射所匹配的请求必须携带param请求参数
 * "!param"：要求请求映射所匹配的请求必须不能携带param请求参数
 * "param=value"：要求请求映射所匹配的请求必须携带param请求参数且param=value
 * "param!=value"：要求请求映射所匹配的请求必须携带param请求参数但是param!=value
 * @RequestMapping注解的headers属性通过请求的请求头信息匹配请求映射
 * @RequestMapping注解的headers属性是一个字符串类型的数组，可以通过四种表达式设置请求头信
 * 息和请求映射的匹配关系
 * "header"：要求请求映射所匹配的请求必须携带header请求头信息
 * "!header"：要求请求映射所匹配的请求必须不能携带header请求头信息
 * "header=value"：要求请求映射所匹配的请求必须携带header请求头信息且header=value
 * "header!=value"：要求请求映射所匹配的请求必须携带header请求头信息且header!=value
 * 若当前请求满足@RequestMapping注解的value和method属性，但是不满足headers属性，此时页面
 * 显示404错误，即资源未找到
 * 原始方式：/deleteUser?id=1
 * rest方式：/user/delete/1
 * SpringMVC路径中的占位符常用于RESTful风格中，当请求路径中将某些数据通过路径的方式传输到服
 * 务器中，就可以在相应的@RequestMapping注解的value属性中通过占位符{xxx}表示传输的数据，在
 * 通过@PathVariable注解，将占位符所表示的数据赋值给控制器方法的形参
 */
@Controller
//@RequestMapping("/test")
public class TestRequestMappingController {
    //此时请求映射所映射的请求的请求路径为：/test/hello
    @RequestMapping(
            value = {"/hello","/abc"},
            method = {RequestMethod.POST,RequestMethod.GET}
//            params = {"username","!password","age=20","gender!=女"}
//            headers = {"referer"}
    )
    public String hello(){
        return "success";
    }
    @RequestMapping("/a?a/test/ant")
    public String testAnt(){
        return "success";
    }
    @RequestMapping("/aaa/test/{username}/{id}")
    public String testRest(@PathVariable("username") String username, @PathVariable("id") Integer id){
        System.out.println("username："+username);
        System.out.println("id："+id);
        return "success";
    }

}

