package com.company.java1;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/8/30 15:32
 *
 * 匿名对象
 * 1：创建的对象没有显式赋给一个对象名
 * 2：匿名对象只能调用一次
 * 3：
 */
public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p);

        p.sendEmail();
        p.playGame();
        // 匿名
        new Phone().sendEmail();
        new Phone().playGame();

        new Phone().price=1999;
        new Phone().showPrice();
        //********************************
        PhoneMall mall = new PhoneMall();
        mall.show(new Phone());

    }
}
class PhoneMall{
    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}
class Phone{
    double price;

    public void sendEmail(){
        System.out.println("发送邮件");
    }
    public void playGame(){
        System.out.println("玩游戏");
    }
    public void showPrice(){
        System.out.println("手机价格为："+price);
    }
}