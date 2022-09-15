import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 在线聊天室：客户端
 * 目标：加入容器实现群聊
 * @Author: Robin_Wujw
 * @Date: 2022-05-03 14:50
 */
public class FClient {
    public static void main(String[] args) throws IOException {
        System.out.println("------client--------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入用户名:");
        String name = br.readLine();
        //1.建立连接 使用Socket创建客户端 + 服务器的地址和端口
        Socket client = new Socket("localhost",8888);
        //2.客户端发送消息
        new Thread(new fSend(client,name)).start();
        new Thread(new Receive(client)).start();

    }
}
