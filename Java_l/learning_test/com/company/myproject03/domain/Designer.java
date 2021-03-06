package com.company.myproject03.domain;

/**
 * @Author: Robin_Wujw
 * @Date: 2022/3/17 21:15
 */
public class Designer extends Programmer{
    private double bonus;//奖金

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetails() + "\t设计师\t" + getStatus() + "\t" + bonus + "\t\t" + getEquipment().getDescription() ;
    }
    public String getDetailsForTeam(){
        return  getTeamBaseDetails()  + "\t设计师\t" + getBonus();
    }
}
