package reflection.test;

import reflection.bean.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 通过反射API动态的操作：构造器、方法、属性
 * @Author: Robin_Wujw
 * @Date: 2022-06-24 18:22
 */
public class Demo03 {
    public static void main(String[] args) {
        //动态操作构造器
        String path = "reflection.bean.User";
        try {
            Class<User> clazz = (Class<User>) Class.forName(path);

            //通过反射Api 动态调用构造方法，构造对象
            User u = clazz.newInstance();//其实是调用了User的无参构造方法
            System.out.println(u);

            Constructor<User> c = clazz.getDeclaredConstructor(int.class,int.class,String.class);
            User u2 = c.newInstance(123,18,"Robin");
            System.out.println(u2.getUname());

            //通过反射API调用普通方法
            User u3 = clazz.newInstance();
            Method method = clazz.getDeclaredMethod("setUname", String.class);
            method.invoke(u3,"Robin1");
            //这种好处就是 方法名和参数都是字符串 可以从数据库等地方动态调用
            System.out.println(u3.getUname());

            //通过反射API操作属性
            User u4 = clazz.newInstance();
            Field f = clazz.getDeclaredField("uname");
            f.setAccessible(true);//这个属性不需要做安全检查了，可以直接访问
            //启用和禁用访问安全检查的开关，值为true则指示反射的对象再使用时应该取消Java语言访问检查。
            //值为false则指示反射的都西昂应该实施Java语言访问检查。
            //禁止安全检查，可以提高反射的运行速度
            f.set(u4,"Robin2");//通过反射直接写属性
            System.out.println(u4.getUname());//通过反射直接读属性的值
            System.out.println(f.get(u4));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
