package com.robin.spring.aop.annotation.impl;


import com.robin.spring.aop.annotation.Calculator;
import org.springframework.stereotype.Component;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-08-30 12:53
 */
@Component
public class CalculatorImpl implements Calculator {

    @Override
    public int add(int i, int j) {

        int result = i+j;
        System.out.println("方法内部，result:"+result);

        return result;
    }

    @Override
    public int sub(int i, int j) {

        int result = i-j;
        System.out.println("方法内部，result:"+result);

        return result;
    }

    @Override
    public int mul(int i, int j) {

        int result = i*j;
        System.out.println("方法内部，result:"+result);

        return result;
    }

    @Override
    public int div(int i, int j) {

        int result = i/j;
        System.out.println("方法内部，result:"+result);

        return result;
    }
}