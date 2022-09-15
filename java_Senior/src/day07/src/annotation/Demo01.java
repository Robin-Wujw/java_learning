package annotation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-06-21 17:45
 * 不是程序本身，可以对程序作出解释
 * 可以被其他程序(比如编译器等)读取
 */
public class Demo01 {
    @Override
    public String toString(){
        return "";
    }
    @Deprecated
    public static void test001(){
        System.out.println("test001");
    }
    @SuppressWarnings("all")
    public static void test002(){
        List list = new ArrayList();

    }
    public static void main(String[] args) {
        Date d = new Date();
        test001();
    }
}
