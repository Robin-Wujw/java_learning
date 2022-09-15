import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 基本类型：接收端
 * 1.使用DatagramSocket指定端口 创建接收端
 * 2.准备容器 封装成DatagramPacket包裹
 * 3.阻塞式接收包裹receive(DatagramPacket p)
 * 4.分析数据 将字节数组还原成对应的类型
 *   byte[] getData()
 *          getLength()
 * 5.释放资源
 * @Author: Robin_Wujw
 * @Date: 2022-04-27 15:22
 */
public class UdpTypeServer {
    public static void main(String[] args) throws IOException {
        System.out.println("接收方启动中");
        //        1.使用DatagramSocket指定端口 创建接收端
        DatagramSocket server = new DatagramSocket(9999);
//        2.准备容器 封装成DatagramPacket包裹
        byte[] container = new byte[1024*60];
        DatagramPacket packet = new DatagramPacket(container,0,container.length);
//        3.阻塞式接收包裹receive(DatagramPacket p)
        server.receive(packet);//阻塞式
//        4.分析数据
//            byte[] getData()
//                getLength()
        byte[] datas = packet.getData();
        int len = packet.getLength();
        DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
        //顺序与写出一致
        String msg = dis.readUTF();
        int age = dis.readInt();
        boolean flag = dis.readBoolean();
        char ch = dis.readChar();
        System.out.println(msg+"-->"+flag);
        //5.释放资源
        server.close();
    }
}
