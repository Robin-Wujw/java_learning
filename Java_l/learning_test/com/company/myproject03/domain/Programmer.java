package com.company.myproject03.domain;

import com.company.myproject03.service.Status;

/**
 * @Author: Robin_Wujw
 * @Date: 2022/3/17 20:59
 */
public class Programmer extends Employee{
    private int memberId;//开发团队中的id
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary,Equipment equipment) {
        super(id, name, age, salary);
        this.status = status;
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
    public String getTeamBaseDetails(){
        return memberId + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary();
    }
    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" +status+"\t\t\t"+equipment.getDescription();
    }
    public String getDetailsForTeam(){
        return  getTeamBaseDetails() + "\t程序员";
    }
}
