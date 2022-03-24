package com.company.java4.test1;

import com.company.java4.test.Order;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/9/12 19:58
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderPublic = 1;
        order.methodPublic();
        //不同包下的普通类（非子类）要使用Order类，不可以调用声明为private、缺省、protected权限的属性、方法
//        order.orderPrivate = 2;
//        order.orderDefalt =3 ;
//        order.orderProtected =4;
    }
}
