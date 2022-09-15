package TestJavassist.test;

import javassist.*;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-07-08 19:25
 */
public class Demo01 {
    public static void main(String[] args) throws CannotCompileException, NotFoundException, IOException {
        ClassPool pool = ClassPool.getDefault();
        CtClass cc = pool.makeClass("TestJavassist.bean.Emp");

        //创建属性
        CtField f1 =  CtField.make("private int empno;",cc);
        CtField f2 = CtField.make("private int ename;",cc);
        cc.addField(f1);
        cc.addField(f2);

        //创建方法
        CtMethod m1 = CtMethod.make("public int getEmpno(){return empno;}",cc);
        CtMethod m2 = CtMethod.make("public void setEmpno(int empno){this.empno=empno;}",cc);
        cc.addMethod(m1);
        cc.addMethod(m2);

        //添加构造器
        CtConstructor constructor = new CtConstructor(new CtClass[]{CtClass.intType,
                pool.get("java.lang.String")},cc);
        constructor.setBody("{this.empno=empno;" +
                "this.ename=ename;}");
        cc.addConstructor(constructor);
        //将上面构造好的类写入
        cc.writeFile("D:\\My_work\\My_Code\\Myjava");
        System.out.println("生成类成功！");
    }
}
