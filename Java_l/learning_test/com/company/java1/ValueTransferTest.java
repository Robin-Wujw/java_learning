package com.company.java1;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/9/1 16:18
 *
 * 关于变量的赋值
 *      如果变量是基本数据类型，此时赋值的是变量所保存的数据值。
 *      如果变量是引用数据类型，此时赋值的是变量所保存的数据的地址值。
 *
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        System.out.println("**************基本数据类型：*************");
        int m = 10;
        int n = m;
        System.out.println("m="+m+",n="+n);
        n = 20;
        System.out.println("m="+m+",n="+n);
        System.out.println("**************************************");
        Order o1 = new Order();
        o1.oderId = 1001;
        Order o2 = o1; //赋值之后 o1和o2得地址值相同，都指向了堆空间中同一个对象实体
        System.out.println("o1.orderId="+o1.oderId+",o2.orderId="+o2.oderId);
        o2.oderId = 1002;
        System.out.println("o1.orderId="+o1.oderId+",o2.orderId="+o2.oderId);
    }
}

class Order{
    public int orderDefault;
    int oderId;
}