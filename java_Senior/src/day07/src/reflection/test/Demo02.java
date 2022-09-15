package reflection.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 应用反射的API获取类的信息(类的名字、属性、方法、构造器等)
 * @Author: Robin_Wujw
 * @Date: 2022-06-23 18:52
 */
public class Demo02 {
    public static void main(String[] args) {
        String path = "reflection.bean.User";
        try {
            Class<?> clazz = Class.forName(path);

            //获取类的名字
            System.out.println(clazz.getName());//获得包名+类名
            System.out.println(clazz.getSimpleName());//获得类名：User

            //获得属性
            Field[] fields = clazz.getFields(); //只能获得public的field
            Field[] fields1 = clazz.getDeclaredFields();//获得所有的field
            System.out.println(fields.length);
            System.out.println(fields1.length);
            for(Field temp:fields1){
                System.out.println("属性："+temp);
            }
            //获得方法
            Method[] methods = clazz.getDeclaredMethods();
            Method m01 = clazz.getDeclaredMethod("getUname",null);
            Method m02 = clazz.getDeclaredMethod("setUname", String.class);
            for(Method m : methods){
                System.out.println("方法"+m);
            }
            //获得构造器
            Constructor[] constructors =  clazz.getDeclaredConstructors();
            Constructor c = clazz.getConstructor(null);
            System.out.println("获得构造器"+c);
            Constructor c1 = clazz.getConstructor(int.class,int.class,String.class);
            System.out.println("获得构造器"+c1);
            for(Constructor temp:constructors){
                System.out.println("构造器"+temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
