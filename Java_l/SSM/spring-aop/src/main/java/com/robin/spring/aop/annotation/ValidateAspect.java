package com.robin.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-08-30 20:57
 */
@Component
@Aspect
@Order(1)
public class ValidateAspect {
//    @Before("execution(* com.robin.spring.aop.annotation.impl.CalculatorImpl.*(..))")
    @Before("com.robin.spring.aop.annotation.LoggerAspect.pointCut()")
    public void beforeMethod(){
        System.out.println("ValidateAspect--->前置通知");
    }

}
