package com.company.java5;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/9/13 23:37
 */
public class Woman extends Person{
    boolean isBeauty;

    public void goShopping(){
        System.out.println("女人喜欢购物");
    }

    @Override
    public void eat() {
        System.out.println("女人少吃，为了减肥");
    }

    @Override
    public void walk() {
        System.out.println("女人窈窕地走路");
    }
}
