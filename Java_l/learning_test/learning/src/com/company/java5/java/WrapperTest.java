package com.company.java5.java;

import org.junit.Test;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/9/22 17:42
 * 包装类的使用：
 * 1.java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
 * 2.掌握的：基本数据类型、包装类、String三者之间的相互转换
 */
public class WrapperTest {
    //String 类型---->基本数据类型、包装类：调用包装类的parseXXX()
    @Test
    public void test5(){
        String str1 = "123";
        //可能会报NumberFormatException
        //错误的情况
//        int num1 = (int)str1; //不可以
//        Integer in1 = (Integer)str1;//不可以
        int num2 = Integer.parseInt(str1);
        System.out.println(num2 + 1);
        String str2 = "true1";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);//false
    }

    //基本数据类型、包装类--->String型：调用String重载的valueOf(xxx xxx)
    @Test
    public void test4(){
        int num1 = 10;
        //方式1：连接运算
        String str1 = num1 + "";
        //方式2：调用String重载的valueOf(xxx xxx)
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);//"12.3"

        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str2);
        System.out.println(str3);
    }



    /**
     * JDK 5.0新特性：自动装箱与拆箱
     */
    @Test
    public void test3(){
//        int num1 = 10;
//        //基本数据类型-->包装类对象
//        method(num1);//
        //自动装箱： 基本数据类型-->包装类对象
        int num2 = 10;
        Integer in1 = num2;//自动装箱
        boolean b1 = true;
        Boolean b2 = b1;//自动装箱
        //自动拆箱：包装类-->基本数据类型
        System.out.println(in1.toString());
        int num3 = in1;//自动拆箱

    }
    public void method(Object obj){}
    //包装类--->基本数据类型:调用包装类的xxxValue()
    @Test
    public void test2(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1 + 1);

        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2 + 1);
    }

    //基本数据类型--->包装类:调用包装类的构造器
    @Test
    public void test1(){
        int num1 = 10;
//        System.out.println();
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());

        Integer in2 = new Integer("123");
        System.out.println(in2);
        System.out.println(in2.toString());

//        Integer in3 = new Integer("123abc");
//        System.out.println(in3.toString());
        Float f1 = new Float(12.4f);
        Float f2 = new Float(12.4);
        System.out.println(f1);
        System.out.println(f2);

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("true123");
        System.out.println(b3);//false

        Order order = new Order();
        System.out.println(order.isMale);//false
        System.out.println(order.isFemale);//null
    }
}

class Order{
    boolean isMale;
    Boolean isFemale;
}
