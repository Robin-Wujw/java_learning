import java.io.UnsupportedEncodingException;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-04-20 16:09
 */
public class ContentDecode {
    public static void main(String[] args) {
        String msg = "性命生命使命a";
        //编码：字节数组
        byte[] datas = msg.getBytes();//默认使用工程的字符集

        //解码：字符串
        try {
            msg = new String(datas,0,datas.length,"utf8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(msg);

        //乱码：
        //1)字节数不够
        try {
            msg = new String(datas,0,datas.length-2,"utf8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(msg);

        //2)字符集不统一
        try {
            msg = new String(datas,0,datas.length,"gbk");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(msg);
    }
}
