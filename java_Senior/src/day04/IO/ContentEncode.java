import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * 编码： 字符串--->字节
 * @Author: Robin_Wujw
 * @Date: 2022-04-20 16:05
 */
public class ContentEncode {
    public static void main(String[] args) {
        String msg = "性命生命使命a";
        //编码：字节数组
        byte[] datas = msg.getBytes();//默认使用工程的字符集
        System.out.println(datas.length);
        //编码：其他字符集
        datas = msg.getBytes(StandardCharsets.UTF_16LE);
        System.out.println(datas.length);

        try {
            datas = msg.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(datas.length);
    }
}
