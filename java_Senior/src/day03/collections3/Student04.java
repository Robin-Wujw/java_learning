/**
 * ?类型不定，使用时确定类型
 * ?的使用:声明类型|声明方法上，不能声明类或使用时
 * ? extends: <= 上限 指定类型子类或自身
 * ？ super >= 喜爱先指定类型为自身或父类
 * @Author: Robin_Wujw
 * @Date: 2022-04-17 16:50
 */
public class Student04<T> {
    T score;

    public static void main(String[] args) {
        Student04<?> stu = new Student04<String>();
        test(new Student04<Integer>());
        test2(new Student04<Apple>());
        //test3(new Student04<Apple>()); //泛型没有多态
        //test4(new Student04<Apple>()); // <
        //stu = new Student<Fruit>();
        //test4(stu);//使用时确定类型
        test4(new Student04<Object>());
        test4(new Student04<Fruit>());

    }
    public static void test(Student04<?> stu){}
    public static void test2(Student04<? extends Fruit> stu){}
    //public static void test3(Student04<Fruit> stu){}
    public static void test4(Student04<? super Fruit> stu){}
}
