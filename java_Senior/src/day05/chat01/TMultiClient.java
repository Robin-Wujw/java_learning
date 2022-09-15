import java.io.*;
import java.net.Socket;

/**
 * 在线聊天室：客户端
 * 目标：使用多线程实现多个客户可以正常收发多条信息
 * @Author: Robin_Wujw
 * @Date: 2022-05-03 14:50
 */
public class TMultiClient {
    public static void main(String[] args) throws IOException {
        System.out.println("------client--------");
        //1.建立连接 使用Socket创建客户端 + 服务器的地址和端口
        Socket client = new Socket("localhost",8888);
        //2.客户端发送消息
        //2.操作： 输入输出流操作
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        DataInputStream dis = new DataInputStream(client.getInputStream());
        boolean isRunning = true;
        while(isRunning) {
            String msg = console.readLine();
            dos.writeUTF(msg);
            dos.flush();
            //3.获取消息
            msg = dis.readUTF();
            System.out.println(msg);
        }
        dos.close();
        dis.close();
        client.close();
    }
}
