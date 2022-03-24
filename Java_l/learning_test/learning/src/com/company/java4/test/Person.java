package com.company.java4.test;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/9/11 16:34
 */
public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void walk(int distance){
        System.out.println("走路,走的距离是："+distance+"公里");
    }
    private void show(){
        System.out.println("我是一个人");
    }
    public Object info(){
        return null;
    }
    public double info1(){
        return 1.0;
    }
}
