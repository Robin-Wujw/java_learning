import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 使用多线程封装发送端
 * 1.发送消息
 * 2.释放资源
 * 3.从控制台获取消息
 * 4.重写run
 * @Author: Robin_Wujw
 * @Date: 2022-05-15 16:16
 */
public class fSend implements Runnable{
    private BufferedReader console;
    private DataOutputStream dos;
    private Socket client;
    private Boolean isRunning;
    private String name;
    public fSend(Socket client,String name){
        this.client = client;
        this.name = name;
        this.isRunning = true;
        console = new BufferedReader(new InputStreamReader(System.in));
        try {
             dos = new DataOutputStream(client.getOutputStream());
             //发送名称
             send(name);
        } catch (IOException e) {
            System.out.println("客户端发送");
            release();
        }
    }
    /*
    从控制台获取消息
     */
    private String getStrFromConsole(){
        String msg = null;
        try {
            return console.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
    //发送消息
    private void send(String msg){
        try {
            dos.writeUTF(msg);
            dos.flush();
        } catch (IOException e) {
            System.out.println("client的发送出问题了");
            release();
        }
    }
    //释放资源
    private void release(){
        this.isRunning = false;
        SxtUtils.close(dos,client);
    }
    @Override
    public void run() {
        while(isRunning){
            String msg = getStrFromConsole();
            if(!msg.equals("")){
                send(msg);
            }
        }
    }
}
