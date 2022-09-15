import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * 使用多线程封装接收端
 * 1.接收消息
 * 2.释放资源
 * 3.重写run
 * @Author: Robin_Wujw
 * @Date: 2022-05-15 16:16
 */
public class Receive implements Runnable{

    private Socket client;
    private DataInputStream dis;
    private boolean isRunning;
    public Receive(Socket client){
        this.client = client;
        try {
            dis = new DataInputStream(client.getInputStream());
            isRunning = true;
        } catch (IOException e) {
            System.out.println("客户端的接收出错");
            release();
        }

    }
    //接收消息
    private String receive(){
        String msg = "";
        try {
            msg = dis.readUTF();
        } catch (IOException e) {
            System.out.println("客户端接收出问题了");
            release();
        }
        return msg;
    }
    //释放资源
    private void release(){
        this.isRunning = false;
        SxtUtils.close(dis,client);
    }
    @Override
    public void run() {
        while(isRunning){
            String msg = receive();
            if(!msg.equals("")){
                System.out.println(msg);
            }
        }
    }
}
