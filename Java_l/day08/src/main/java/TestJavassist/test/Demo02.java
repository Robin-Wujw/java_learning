package TestJavassist.test;

import javassist.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 测试javassist的Api
 * @Author: Robin_Wujw
 * @Date: 2022-07-08 20:07
 */
public class Demo02 {
    /*
    处理类的基本用法
     */
    public static void test01() throws NotFoundException, IOException, CannotCompileException {
        ClassPool pool = ClassPool.getDefault();
        CtClass cc =  pool.get("TestJavassist.test.Emp");

        byte[] bytes = cc.toBytecode();
        System.out.println(Arrays.toString(bytes));

        System.out.println(cc.getName());//获取类名
        System.out.println(cc.getSimpleName());//获取简要类名
        System.out.println(cc.getSuperclass());//获取父类
        System.out.println(cc.getInterfaces());//获取接口
    }

    /*
    处理方法的基本用法
    */
    public static void test02() throws NotFoundException, CannotCompileException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ClassPool pool = ClassPool.getDefault();
        CtClass cc =  pool.get("TestJavassist.test.Emp");

        //CtMethod m = CtNewMethod.make("public int add(int a,int b){retuan a+b;}",cc);

        CtMethod m = new CtMethod(CtClass.intType,"add",new CtClass[]{
                CtClass.intType,CtClass.intType
        },cc);
        m.setModifiers(Modifier.PUBLIC);
        m.setBody("{System.out.println(\"hello\"); return $1+$2;}");

        cc.addMethod(m);

        //通过反射调用新生成的方法
        Class clazz = cc.toClass();
        Object obj = clazz.newInstance();//通过调用Emp无参构造器，创建新的Emp对象

        Method method = clazz.getDeclaredMethod("add",int.class,int.class);
        Object result = method.invoke(obj,200,300);
        System.out.println(result);
    }
    /*
     * @Author Robin_Wu
     * @Description  修改已有的方法的信息，修改方法体的内容
     * @Date 16:19 2022/7/11
     * @Param []
     * @return void
     **/
    public static void test03() throws NotFoundException, CannotCompileException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ClassPool pool = ClassPool.getDefault();
        CtClass cc =  pool.get("TestJavassist.test.Emp");

        CtMethod cm =  cc.getDeclaredMethod("sayHello",new CtClass[]{CtClass.intType});
        cm.insertBefore("System.out.println($1);System.out.println(\"start!!!\");");
        cm.insertAfter("System.out.println(\"end!!!\");");
        cm.insertAt(12,"int b =3; System.out.println(\"b=\"+b);");
        //通过反射调用新生成的方法
        Class clazz = cc.toClass();
        Object obj = clazz.newInstance();//通过调用Emp无参构造器，创建新的Emp对象

        Method method = clazz.getDeclaredMethod("sayHello",int.class);
        Object result = method.invoke(obj,300);
    }
    /*
     * @Author Robin_Wu
     * @Description 属性的操作
     * @Date 16:24 2022/7/11
     * @Param []
     * @return void
     **/
    public static void test04() throws NotFoundException, CannotCompileException {
        ClassPool pool = ClassPool.getDefault();
        CtClass cc =  pool.get("TestJavassist.test.Emp");

        CtField f1 = new CtField(CtClass.intType,"salary",cc);
        f1.setModifiers(Modifier.PRIVATE);
        cc.addField(f1);
        //增加相应的set get方法
        cc.addMethod(CtNewMethod.getter("getSalary",f1));
        cc.addMethod(CtNewMethod.setter("setSalary",f1));
//        cc.getDeclaredField("ename"); //获取指定的属性
    }
    /*
     * @Author Robin_Wu
     * @Description 构造方法的操作
     * @Date 16:26 2022/7/11
     * @Param []
     * @return void
     **/
    public static void test05() throws NotFoundException {
        ClassPool pool = ClassPool.getDefault();
        CtClass cc =  pool.get("TestJavassist.test.Emp");

        CtConstructor[] cs =  cc.getConstructors();
        for(CtConstructor c: cs){
            System.out.println(c.getLongName());
        }
    }
    public static void test06() throws NotFoundException, ClassNotFoundException {
        ClassPool pool = ClassPool.getDefault();
        CtClass cc =  pool.get("TestJavassist.test.Emp");
        Object[] all = cc.getAnnotations();
        Author a = (Author)all[0];
        String name = a.name();
        int year = a.year();
        System.out.println("name:" + name + ",year:"+year);
    }
    public static void main(String[] args) throws NotFoundException, IOException, CannotCompileException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        test06();
    }
}
