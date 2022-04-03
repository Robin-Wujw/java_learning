package com.company.myproject03.service;

/**
 * @Author: Robin_Wujw
 * @Date: 2022/3/17 21:03
 * 表示员工的状态
 */
public class Status {

    private final String NAME;
    private Status(String name){
        this.NAME = name;
    }
    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VOCATION = new Status("VOCATION");
    public String getNAME() {
        return NAME;
    }
    @Override
    public String toString() {
        return NAME;
    }
}
