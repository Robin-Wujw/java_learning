package java1;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-03-30 10:54
 * 使用同步方法来处理继承Thread类的方式中的线程安全问题
 *
 */
class Window4<ticket> extends Thread{

    private static int ticket = 100;
    private static Object obj = new Object();
    @Override
    public void run() {
        while(true){
            show();
        }
    }
    private static synchronized void show(){//同步监视器：java.Window4
    //private synchronized void show(){// 同步监视器： t1,t2,t3。此种解决方式是错误的
        if(ticket > 0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
            ticket --;
        }
    }
}
public class WindowTest4 {
    public static void main(String[] args) {
        Window4 t1 = new Window4();
        Window4 t2 = new Window4();
        Window4 t3 = new Window4();

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();

    }
}