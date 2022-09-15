import java.io.*;
import java.net.URL;


/**
 * 转换流： InputStreamReader OutputStreamWriter
 * 1.以字符流的形式操作字节流(纯文本的)
 * 2.指定字符集
 * @Author: Robin_Wujw
 * @Date: 2022-04-23 15:18
 */
public class ConvertTest01 {
    public static void main(String[] args) {
        //操作网络流
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                new URL("http://www.baidu.com").openStream(),"UTF-8"));) {
            String msg;
            while ((msg = reader.readLine()) != null) {
                System.out.print(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void test1(){
        //操作网络流
        try (InputStream is = new URL("http://www.baidu.com").openStream();) {
            int temp;
            while ((temp = is.read()) != -1) {
                System.out.print((char) temp);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void test2(){
        //操作网络流
        try (InputStreamReader is = new InputStreamReader(new URL("http://www.baidu.com").openStream(),"UTF-8");) {
            int temp;
            while ((temp = is.read()) != -1) {
                System.out.print((char) temp);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}


