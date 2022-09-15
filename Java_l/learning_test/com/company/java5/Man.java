package com.company.java5;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/9/13 23:35
 */
public class Man extends Person{
    boolean isSmoking;
    int id = 1002;
    public void earnMoney(){
        System.out.println("男人负责挣钱养家");
    }

    @Override
    public void eat() {
        System.out.println("男人多吃肉，长肌肉");
    }

    @Override
    public void walk() {
        System.out.println("男人霸气的走路");
    }
}
