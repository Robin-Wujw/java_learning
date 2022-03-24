package com.company.java4.test1;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/9/12 20:13
 */
public class Student extends Person{
    String major;
    int id=1002;//学号
    public Student(){

    }

    public Student(String major) {
//        super();
        this.major = major;
    }

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生，多吃有营养的食物");
    }
    public void study(){
        System.out.println("学生：学习知识");
        this.eat();
        super.eat();
        super.walk();
    }
    public void show(){
        System.out.println("name="+this.name+",age="+ super.age);
        System.out.println("id="+id);
        System.out.println("id="+super.id);
    }
}
