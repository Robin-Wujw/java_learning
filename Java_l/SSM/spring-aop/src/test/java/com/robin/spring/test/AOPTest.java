package com.robin.spring.test;

import com.robin.spring.aop.annotation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-08-30 19:05
 */
public class AOPTest {

    @Test
    public void testAOPByAnnotation(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator  = ioc.getBean(Calculator.class);
        calculator.sub(1,2);
    }


}
