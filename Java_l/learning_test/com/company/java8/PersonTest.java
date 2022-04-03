package com.company.java8;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/10/9 20:26
 * 抽象类的匿名子类
 */
public class PersonTest {
    public static void main(String[] args) {
        method(new Student());//匿名对象
        Worker worker = new Worker();
        method1(worker);//非匿名类 非匿名对象
        //method1(new Worker());//非匿名类 匿名对象
        System.out.println("******************************");
        //创建了一个匿名子类的对象: p
        Person p = new Person(){
            @Override
            public void eat() {
                System.out.println("吃东西");
            }
            @Override
            public void breath() {
                System.out.println("好好呼吸");
            }
        };
        method1(p);
        System.out.println("********************");
        method1(new Person() {
            @Override
            public void eat() {
                System.out.println("吃好吃的东西");
            }

            @Override
            public void breath() {
                System.out.println("好好呼吸新鲜空气");
            }
        });//创建匿名子类的匿名对象
    }
    public static void method(Student s){
    }
    public static void method1(Person p){
        p.eat();
        p.breath();
    }
}
class Worker extends Person{
    @Override
    public void eat() {
        System.out.println("吃饭");
    }
    @Override
    public void breath() {
        System.out.println("呼吸");
    }
}