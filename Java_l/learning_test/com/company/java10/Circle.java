package com.company.java10;
/*
 * @Author Robin_Wu
 * @Description  定义一个Circle类，声明radius属性，提供getter和setter方法
 * @Date 11:53 2022/2/11
 * @Param
 * @return
 **/

public class Circle {
    private Double radius;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Circle(Double radius) {
        super();
        this.radius = radius;
    }

    public Circle() {
        super();
    }
}