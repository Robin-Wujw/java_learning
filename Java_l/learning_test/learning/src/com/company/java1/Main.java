package com.company.java1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int[] ids; //声明
        //静态初始化 数组初始化和赋值操作同时进行
        ids = new int[]{1001,1002,1003,10004};
        //动态初始化 数组初始化和数组元素的赋值操作分开进行
        String[] names = new String[5];


        //调用指定位置的元素
        names[0] = "你好";
        System.out.println(names.length);
     }
}
