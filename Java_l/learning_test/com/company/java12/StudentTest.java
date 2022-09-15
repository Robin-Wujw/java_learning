package com.company.java12;

/**
 * @Author: Robin_Wujw
 * @Date: 2022/3/10 22:33
 *  throw 和 throws的区别：
 *  throw 表示抛出一个异常类的对象，生成异常对象的过程。声明在方法体内。
 *  throws 属于异常处理的一种方式，声明在方法的声明处。
 */
public class StudentTest {
    public static void main(String[] args) {
        try {
            Student s = new Student();
            s.regist(-1001);
            System.out.println(s);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println( e.getMessage());
        }
    }
}

class Student{
    private int id;

    public void regist(int id) {   //异常处理
        if(id > 0){
            this.id = id;
        }else{
            //System.out.println("您输入的数据非法");
            //手动抛出异常对象
            //throw new RuntimeException("您输入的数据非法！");
//            throw new Exception("您输入的数据非法！");  //手动抛出异常
            throw new MyException("不能输入负数");
        }
    }
    @Override
    public String toString(){
        return "Student [id=" + id + "]";
    }
}
