package com.company.java1;

/**
 * 2 * @Author: Robin_Wujw
 * 3 * @Date: 2021/8/24 23:42
 * 一、java面向对象学习的三条主线：
 * 1.java类及类的成员 ： 属性、方法、构造器； 代码块、内部类
 * 2.面向对象的三大特征： 封装、继承、多态
 * 3.其他关键字： this、super、static、final、abstract、interface、package、important
 *
 * 二、“人把大象装进冰箱”
 * 1.面向过程:强调的是功能行为，以函数为最小单位，考虑怎么做。
 * 2.面向对象：强调具备了功能的对象，以类/对象为最小单位，考虑谁来做
 *
 *  设计类、其实就是设计类的成员：
 *  属性 = 成员变量 = field = 域、字段
 *  方法 = 成员方法 = 函数 = method
 *  1.创建类、设计类的成员
 *  2.创建类的对象
 *  3.通过对象.属性或对象.方法调用对象的结构
 *  4.如果创建了一个类的多个对象、每个对象都独立的拥有类的属性(非static)
 *      意味着:修改一个对象的属性a不影响另一个对象的属性
 */
public class object1 {
    public static void main(String[] args){
        Person p1 = new Person();

        //调用对象的结构: 属性、方法
        //调用方法: ”对象.属性“
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);

        //调用方法:"对象.方法
        p1.eat();
        p1.sleep();
        p1.talk("中文");

        //***************************
        Person p2 = new Person();
        System.out.println(p2.name);
        //***************************
        //将p1变量保存的对象地址值赋给p3，导致p1和p3指向堆空间同一个对象实体
        Person p3 = p1;
        System.out.println(p3.name);

        p3.age = 10;
        System.out.println(p1.age);
    }
}

class Person{
    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String language){
        System.out.println("人可以说话，使用的是:"+language);
    }

}