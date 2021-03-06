package com.company.java2;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/9/3 17:25
 * 类的结构三：构造器（构造方法、constructor）的使用
 * constructor:
 * 一、构造器的作用：
 * 1.创建对象
 * 2.初始化对象的属性
 * 二、说明
 * 1.如果没有显示的定义类的构造器的话，则系统默认提供一个空参的构造器
 * 2.定义构造器的格式：权限修饰符 类名(形参列表){}
 * 3.一个类中定义的多个构造器，彼此构成重载
 * 4.一旦显示定义了类的构造器之后，系统就不再提供默认的空参构造器
 * 5.一个类中至少会有一个构造器。
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建类的对象 ： new + 构造器
        Person p = new Person("Ro",12);
        p.eat();
        Person p1 = new Person("Tom");
        System.out.println(p1.name);
    }

}

class Person{
    String name;
    int age;
    //构造器
    public Person(){
        System.out.println("Person().....");
    }
    public Person(String n){
        name = n;
        System.out.println("Person().....");
    }
    public Person(String n,int a){
        this(n);//构造器调用构造器
        age = a;
        System.out.println("Person().....");
    }
    public void eat(){
        System.out.println("人吃饭");
    }
    public void study(){
        System.out.println("人学习");
    }
}