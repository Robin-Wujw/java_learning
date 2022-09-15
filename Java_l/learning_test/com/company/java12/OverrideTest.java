package com.company.java12;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: Robin_Wujw
 * @Date: 2022/3/10 22:02
 * 方法重写的规则之一：
 * 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 */
public class OverrideTest {
    public static void main(String[] args) {
        OverrideTest test = new OverrideTest();
        test.display(new SubClass());
    }
    public void display(SubClass s ){
        try {
            s.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class SuperClass {

    public void method() throws IOException{

    }
}

class SubClass extends SuperClass{
    public void method() throws FileNotFoundException {

    }
}