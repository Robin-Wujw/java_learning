package com.company.java7;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/9/28 23:01
 * 类的成员之四：代码块(或初始化块)
 *
 * 1.代码块的作用：用来初始化类、对象
 * 2.代码块如果有修饰的话，只能使用static
 * 3.分类： 静态代码块 vs 非静态代码块
 *
 * 4.静态代码块：
 *      >内部可以有输出语句
 *      >随着类的加载而执行,而且只执行一次
 *      >作用:初始化类的属性
 *      >如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
 *      >静态代码块优先于非静态代码块执行
 *      >静态代码块内只能调用静态的属性、方法，不能调用非静态的结构
 * 5.非静态代码块：
 *      >内部可以有输出语句
 *      >随着对象的创建而执行
 *      >每创建一个对象，执行一次非静态代码块
 *      >作用：可以在创建对象时对对象的属性等进行初始化
 *      >如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
 *      >非静态代码块内可以调用静态的属性、方法，也调用非静态的结构
 * 属性可以赋值的位置：
 * ①默认初始化
 * ②显示初始化
 * ③构造器中初始化
 * ④有了对象之后，可以通过"对象.属性"或"对象.方法"的方式进行赋值
 * ⑤在代码块中赋值
 * 顺序 ①->②⑤->③->④
 */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        System.out.println(desc);
        Person p1 = new Person();
        Person p2 = new Person();
        Person.info();
    }
}
class Person{
    //属性
    String name;
    int age;
    static String desc = "我是一个人";

    //构造器
    public Person(){}
    public Person(String name,int age){
        this.name = name;
        this.age  = age;
    }
    //static的代码块
    static{
        System.out.println("Hello,static block-1");
        desc = "我是一个爱学习的人";
        info();
    }
    static{
        System.out.println("Hello,static block-2");
        desc = "我是一个爱学习的人";
    }
    //非static的代码块
    {
        System.out.println("Hello, block-1");
        age = 1;
        eat();
        desc = "我是一个爱学习的人1";
        info();
    }
    {
        System.out.println("Hello, block-2");
        age = 1;
    }

    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void info(){
        System.out.println("我是一个快乐的人");
    }
}