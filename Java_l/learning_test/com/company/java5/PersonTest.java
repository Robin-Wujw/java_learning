package com.company.java5;

import org.junit.Test;

import java.util.Date;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/9/13 23:38
 * 面向对象特征之三：多态性
 *
 * 1.理解多态性：可以理解为一个事物的多种形态。
 * 2.何为多态性：
 *      对象的多态性：父类的引用指向子类的对象(或子类的对象赋给父类的引用)
 * 3.多态的使用：虚拟方法调用
 *      有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法
 *      总结：编译看左边，运行看右边
 * 4.多态性的使用前提：① 要有类的继承关系 ② 要有方法的重写
 * 5.对象的多态性，只适用于方法不适用于属性（编译和运行都看左边）
 * 6.多态性是运行时行为
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();
        //*********************************************************************
        //对象的多态性：父类的引用指向子类的对象
        System.out.println("********************************************");
        Person p2 = new Man();
        //多态的使用： 当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法 ---虚拟方法调用
        p2.eat();
        p2.walk();
//        p2.earnMoney();
//        Person p3 = new Woman();
        System.out.println(p2.id);
        System.out.println("*********************************");
        //不能调用子类特有的方法、属性：编译时，p2是Person类型
        p2.name = "Tom";
        //如何才能调用子类特有的属性和方法？ 向下转型，使用强制类型转换符
        Man m1 = (Man) p2;
        m1.earnMoney();
        m1.isSmoking = true;
        //使用强转时，可能出现ClassCastException的异常
        //Woman w1 = (Woman)p2;
        //w1.goShopping();
        /*
        instanceof 关键字的使用
        a instanceof A:判断对象a是否是类A的实例，如果是，返回true 如果不是，返回false
        使用情境：为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，先
        进行instanceof的判断，一旦返回true，就向下转型，如果返回false则不进行向下转型
        如果 a instanceof A 返回 true，则a instanceof B 也返回true。
        其中 类B是类A的父类
         */
        if(p2 instanceof Woman){
            Woman w1 = (Woman)p2;
            w1.goShopping();
            System.out.println("****************Woman***************");
        }
        if(p2 instanceof Man){
            Man m2 = (Man)p2;
            m2.earnMoney();
            System.out.println("****************Man***************");
        }
        //练习：
        //问题一： 编译时通过，运行时不通过
        //举例一
//        Person p3 = new Woman();
//        Man m3 = (Man)p3;
        //举例二
//        Person p4 = new Person;
//        Man m4 = (Man)p4;
        //问题二： 编译时通过，运行时也通过
//        Object obj = new Woman();
//        Person p = (Person)obj;
        //问题三： 编译不通过
//        Man m5 = new Woman();
//        String str = new Date();
        //绕过编译器 运行不通过
//        Object o = new Date();
//        String str1 = (String)o;
    }

}
