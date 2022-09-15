import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * 发送端
 * 1.使用DatagramSocket指定端口 创建发送端
 * 2.准备数据 转成字节数组
 * 3.封装成DatagramPacket包裹 需要指定目的地
 * 4.发送包裹 send(DatagramPacket p)
 * 4.释放资源
 * @Author: Robin_Wujw
 * @Date: 2022-04-27 15:22
 */
public class UdpClient {
    public static void main(String[] args) throws IOException {
        System.out.println("发送方启动中");
         //1.使用DatagramSocket指定端口 创建发送端
        DatagramSocket client = new DatagramSocket(8888);
         //2.准备数据 转成字节数组
        String data = "上海尚学堂";
        byte[] datas = data.getBytes();
         //3.封装成DatagramPacket包裹 需要指定目的地
        DatagramPacket packet = new DatagramPacket(datas,0,datas.length,
                new InetSocketAddress("localhost",9999));
         //4.发送包裹 send(DatagramPacket p)
        client.send(packet);
         //4.释放资源
        client.close();
    }
}
