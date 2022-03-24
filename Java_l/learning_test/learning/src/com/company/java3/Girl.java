package com.company.java3;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/9/6 16:23
 */
public class Girl {
    private String name;
    private int age;

    public Girl() {
    }

    public Girl(String name, int age) {
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
    public void marry(Boy boy){
        System.out.println("我想嫁给"+boy.getName());
        boy.marry(this);
    }


    /*
     * @Author Robin_Wu
     * @Description 比较两个对象的大小
     * @Date 16:56 2021/9/6
     * @Param [girl]
     * @return int 正数：当前对象大； 负数：当前对象小 0：当前对象与形参对象相等
     **/
    public int compare(Girl girl){
        return this.age - girl.age;
    }
}
