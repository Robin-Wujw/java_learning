package com.company.java4.test1;

import com.company.java4.test.Order;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/9/12 19:49
 */
public class SubOrder extends Order {
    public void method(){
        orderProtected = 1;
        orderPublic = 2;

        methodProtected();
        methodPublic();

        //在不同包的子类中，不能调用Order类中声明为private和缺省权限的属性、方法
//        orderDefalt = 3;
//        orderPrivate = 3;
//        methodDefalt();
//        methodPrivate();
    }

}
