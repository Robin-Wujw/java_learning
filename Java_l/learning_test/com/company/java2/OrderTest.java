package com.company.java2;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/9/3 16:52
 */
public class OrderTest {
    public static void main(String[] args) {
        com.company.java2.Order order = new Order();

        order.orderDefault = 1;
        order.orderPublic = 2;
        //出了Order类之后，私有的结构就不可以调用

        order.methodDefault();
        order.methodPublic();
        //出了Order类之后，私有的结构就不可以调用
    }
}
