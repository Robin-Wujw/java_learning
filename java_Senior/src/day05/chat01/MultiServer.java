import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 在线聊天室：服务端
 * 目标：实现一个客户可以正常收发多条信息
 * @Author: Robin_Wujw
 * @Date: 2022-05-03 14:50
 */
public class MultiServer {
    public static void main(String[] args) throws IOException {
        System.out.println("------server-------");
        //1.指定端口 使用ServerSocket创建服务器
        ServerSocket server = new ServerSocket(8888);
        //  2.阻塞式等待连接 accept
        Socket client = server.accept();
        System.out.println("一个客户端建立了连接");
        DataInputStream dis = new DataInputStream(client.getInputStream());
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        boolean isRunning = true;
        while(isRunning) {
            //3.接收消息
            String msg = dis.readUTF();
            //4.返回消息
            dos.writeUTF(msg);
            dos.flush();
        }

        dos.close();
        dis.close();
        client.close();
    }
}
