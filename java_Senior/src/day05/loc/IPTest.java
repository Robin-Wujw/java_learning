import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * IP: 定位一个节点 ： 计算机 路由 通信设备
 * InetAddress:
 * 1.getLocalHost：本机
 * 2.getByName: 根据域名DNS IP地址
 *
 * 两个成员方法：
 * 1.getHostAddress:返回地址
 * 2.getHostName： 返回计算机名
 * @Author: Robin_Wujw
 * @Date: 2022-04-25 20:14
 */
public class IPTest {
    public static void main(String[] args) throws UnknownHostException {
        //使用getLocalHost方法创建InetAddress对象
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());

        //根据域名得到InetAddress对象
        addr = InetAddress.getByName("www.163.com");
        System.out.println(addr.getHostAddress());//返回ip
        System.out.println(addr.getHostName());//

        //根据ip得到InetAddress对象
        addr = InetAddress.getByName("123.56.138.176");
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());
    }
}
