package Jvm.test;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-07-12 16:23
 */
public class Demo01 {
    static{
        System.out.println("静态初始化Demo01");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Demo01的main方法！");
        //A a = new A();
        //主动引用
        //new A();
        //System.out.println(A.width);
        //Class.forName("Jvm.test.A");
        //被动引用
        //System.out.println(A.MAX);
        //A a2 = new A();
        //A[] as = new A[10];
        //System.out.println(B.width); //子类调用父类的域，子类不会初始化
    }
}

class B extends A{
    static {
        System.out.println("静态初始化B");
    }
}
class A extends A_Father{
    public static int width = 100; //静态变量，静态域 field
    public static final int MAX = 100;

    static {
        System.out.println("静态初始化类A");
        width = 300;
    }
    public A(){
        System.out.println("创建A的对象");
    }
}

class A_Father{
    static {
        System.out.println("静态初始化A_Father");
    }
}
