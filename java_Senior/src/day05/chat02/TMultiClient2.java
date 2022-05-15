import java.io.*;
import java.net.Socket;

/**
 * 在线聊天室：客户端
 * 目标：封装使用多线程实现多个客户可以正常收发多条信息
 * @Author: Robin_Wujw
 * @Date: 2022-05-03 14:50
 */
public class TMultiClient2 {
    public static void main(String[] args) throws IOException {
        System.out.println("------client--------");
        //1.建立连接 使用Socket创建客户端 + 服务器的地址和端口
        Socket client = new Socket("localhost",8888);
        //2.客户端发送消息
        new Thread(new Send(client)).start();
        new Thread(new Receive(client)).start();

    }
}
