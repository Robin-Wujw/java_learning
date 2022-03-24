package com.company.java11;

/**
 * @Author: Robin_Wujw
 * @Date: 2022/3/1 22:35
 */
public class InnerClassTest3 {


//    public void onCreate(){
//
//        int number = 10;
//        View.OnClickListener listener = new View.OnClickListener(){
//            public void onClick(){
//                System.out.println("Hello");
//                System.out.println(number);
//            }
//        };
//        button.setOnClickListener(listener);
//    }
    /*
    在局部内部类的方法中(比如：show)如果调用局部内部类所声明的方法(比如：method)中的局部变量的话(比如：num)
    要求此局部变量声明为final的
    jdk 7 及之前的版本 要求此局部变量显式得声明为final的
    jdk 8 及以后的版本可以省略final的声明
     */
    public void method(){
        //局部变量 默认是final
        int num = 10;
        class AA{

            public void show(){

                System.out.println(num);

            }
        }
    }
}
