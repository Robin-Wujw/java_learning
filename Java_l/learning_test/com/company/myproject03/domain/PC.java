package com.company.myproject03.domain;

/**
 * @Author: Robin_Wujw
 * @Date: 2022/3/17 18:50
 */
public class PC implements Equipment{

    private String model;//机器星号
    private String display;//显示器名称

    public PC() {
        super();
    }

    public PC(String model, String display) {
        super();
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
