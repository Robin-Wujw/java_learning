package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-06-21 21:41
 */
@Target(value={ElementType.FIELD})
//注解只能用在方法前面
@Retention(RetentionPolicy.RUNTIME)
//运行时保留 反射可以读取
public @interface SxtField {
    String columnName();
    String type();
    int length();
}
