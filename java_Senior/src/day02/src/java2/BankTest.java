package java2;

/**
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的
 * @Author: Robin_Wujw
 * @Date: 2022-03-30 13:43
 */

public class BankTest {
    public static void main(String[]args){
        Bank bank = Bank.getInstance();
    }
}

class Bank{

    private Bank(){}

    private static Bank instance = null;

    public static  Bank getInstance(){
        //方式一：效率稍差
//        synchronized (Bank.class) {
//            if(instance == null){
//                instance = new Bank();
//            }
//            return instance;
//        }
        //方式二：效率更高
        if(instance == null) {
            synchronized (Bank.class) {
            if(instance == null){
                instance = new Bank();
                }
            }
        }
        return instance;
        }
}
