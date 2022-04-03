package com.company.java5.java;
import org.junit.Test;

import java.util.Date;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/9/21 23:54
 * Java中的JUnit单元测试
 * 步骤：
 * 1.生成junit
 * 2.创建java类，进行单元测试。
 *      此时的java类要求：①此类是public②此类提供公共的无参的构造器
 * 3.此类中声明单元测试方法。
 *      此时的单元测试方法：方法的权限时public，没有返回值，没有形参
 * 4.此单元测试方法上需要声明注解：@Test，并在单元测试类当中导入 import org.junit.Test
 *
 * 5.声明好单元测试方法后，就可以在方法体内测试相关的代码。
 * 6.写完代码以后，右键执行
 * 说明：
 * 1.如果执行结果没有任何异常，绿条
 * 2.如果执行结果出现异常：红条
 *
 */
public class JUnitTest {
    int num = 10;
    @Test
    public void testEquals()
    {
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1.equals(s2));
        System.out.println(num);
    }
    public void show(){
        num = 20;
        System.out.println("show()....");
    }
    @Test
    public void testToString(){
        String s2 = "MM";
        System.out.println(s2.toString());
    }
}
