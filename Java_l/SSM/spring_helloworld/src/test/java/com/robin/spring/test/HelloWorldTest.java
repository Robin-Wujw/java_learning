package com.robin.spring.test;

import com.robin.spring.pojo.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-08-26 20:43
 */
public class HelloWorldTest {

    @Test
    public void test(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取IOC容器中的Bean对象
        HelloWorld helloworld  = (HelloWorld) ioc.getBean("helloworld");
        helloworld.sayHello();
    }
}
