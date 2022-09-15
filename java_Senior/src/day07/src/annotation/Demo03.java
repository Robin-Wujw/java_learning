package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 使用反射读取注解的信息，模拟处理注解信息的流程
 * @Author: Robin_Wujw
 * @Date: 2022-06-21 21:47
 */
public class Demo03 {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("annotation.Student");
            //获得类的所有有效注解
            Annotation[] anotations = clazz.getAnnotations();
            for (Annotation a : anotations) {
                System.out.println(a);
            }
            //获得类的指定的注解
        Table st = (Table) clazz.getAnnotation(Table.class);
        System.out.println(st.value());
        //获得类的属性的注解
        Field f = clazz.getDeclaredField("studentName");
        SxtField SxtField = f.getAnnotation(annotation.SxtField.class);
        System.out.println(SxtField.columnName()+"--"+SxtField.type()+"--"+SxtField.length());

        //根据获得的表名、字段的信息，拼出DDL语句，然后使用JDBC执行这个SQl，在数据库中生成相关的表
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
