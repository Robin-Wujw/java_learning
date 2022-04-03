package com.company.myproject03.domain;

/**
 * @Author: Robin_Wujw
 * @Date: 2022/3/17 21:17
 */
public class Architect extends Designer{

    private int stock; //股票

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + stock + "\t" + getEquipment().getDescription() ;
    }
    public String getDetailsForTeam(){
        return  getTeamBaseDetails()  + "\t架构师\t" + getBonus() + "\t" + getStock();
    }
}
