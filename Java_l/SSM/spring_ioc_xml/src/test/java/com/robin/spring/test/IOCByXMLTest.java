package com.robin.spring.test;


import com.robin.spring.pojo.Clazz;
import com.robin.spring.pojo.Person;
import com.robin.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-08-26 20:57
 */
public class IOCByXMLTest {

  /**
   * 获取Bean的三种方式
   * 1.根据bean的id获取
   * 2.根据bean的类型获取
   * 注意：根据类型获取bean时，要求IOC容器中有且只有一个类型匹配的bean
   * 3.根据bean的id和类型获取
   */
  @Test
  public void testIOC(){
    //获取IOC容器
    ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
    //获取bean
//    Student studentOne = (Student) ioc.getBean("studentOne");
//    Student student = ioc.getBean(Student.class);
//    Student student = ioc.getBean("studentOne",Student.class);
//    Person student = ioc.getBean("studentOne",Student.class);
//    Person person = ioc.getBean(Person.class);
//    System.out.println(student);
//    System.out.println(person);
    Student student = ioc.getBean("studentTwo",Student.class);
    System.out.println(student);
  }

  @Test
  public void testDI(){
    ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
    Student student = ioc.getBean("studentSix",Student.class);
    System.out.println(student);
//    Clazz clazz = ioc.getBean("clazzInner",Clazz.class);
//    System.out.println(clazz);
//      Clazz clazz = ioc.getBean("clazzOne", Clazz.class);
//    System.out.println(clazz);
  }
}
