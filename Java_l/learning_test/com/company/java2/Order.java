package com.company.java2;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/9/3 16:54
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private void methodPrivate(){
        orderPrivate = 1;
        orderDefault =2;
        orderPublic = 3;
    }
    void methodDefault(){
        orderPrivate = 1;
        orderDefault =2;
        orderPublic = 3;
    }
    public void methodPublic(){
        orderPrivate = 1;
        orderDefault =2;
        orderPublic = 3;
    }
}
