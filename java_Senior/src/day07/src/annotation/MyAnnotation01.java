package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-06-10 16:45
 * Target 用于描述注解的使用范围
 * Retention 表示需要在什么级别保存该注释信息，用于描述注解的生命周期
 *  SOURCE 在源文件中有效
 *  CLASS  在class文件中有效
 *  RUNTIME 在运行时有效，为Runtime可以被反射机制读取
 */

@Target(value={ElementType.METHOD,ElementType.TYPE})
//注解只能用在方法前面
@Retention(RetentionPolicy.RUNTIME)
//运行时保留 反射可以读取
public @interface MyAnnotation01 {
    String studentName() default "";
    int age() default 0;
    int id() default -1;//String indexOf("abc") -1

    String[] schools() default {"清华大学"};
}
