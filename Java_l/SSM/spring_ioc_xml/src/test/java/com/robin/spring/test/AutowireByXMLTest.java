package com.robin.spring.test;

import com.robin.spring.pojo.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-08-29 21:19
 */
public class AutowireByXMLTest {

    /**
     * 自动装配：
     * 根据指定的策略，在IOC容器中匹配某个bean，自动为bean中的类类型的属性活接口类型的属性赋值
     * bean标签的autowire设置策略
     * 自动装配的策略：
     * no,default:表示不装配，即bean中的属性不会自动匹配某个bean为属性赋值，为默认值
     * byType:根据要赋值的属性的类型，在IOC容器中匹配某个bean为属性赋值
     * 注意
     * 1.若通过类型没有找到任何一个类型匹配的bean，此时不装配，属性使用默认值
     * 2.若找到了多个类型匹配的bean 就会抛出异常
     * 总结：当使用byType实现自动装配时，IOC容器中有且只有一个类型匹配的bean能够为属性赋值
     */
    @Test
    public void testAutowire(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();
    }
}
