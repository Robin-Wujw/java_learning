package com.company.java5;

import java.util.Objects;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/9/17 17:42
 */
public class Customer {
    private String name;
    private int age;

    public Customer() {
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    手动实现equals的方式
//    @Override
//    public boolean equals(Object obj) {
//        System.out.println("Customer重写的equals方法");
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof Customer) {
//            Customer cust = (Customer) obj;
//            //比较两个对象的每个属性是否相同
//            return this.age == cust.age && this.name.equals(cust.name);
//        }else{
//            return false;
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
