import java.io.*;

/**
 * 分段读取 文件字符输入流
 * @Author: Robin_Wujw
 * @Date: 2022-04-21 16:11
 */
public class IOTest05 {
    public static void main(String[] args) {
        //1.创建源
        File src = new File("src/day04/IOStream/dest.txt");
        Reader reader = null;
        try {
            reader = new FileReader(src);
            //3.操作(分段读取)
            char[] flush = new char[1024];//缓冲容器
            int len = -1;//接收长度
            while((len=reader.read(flush))!=-1) {
                //字符数组 ---->字符串(解码)
                String str = new String(flush,0,len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.释放资源
            try {
                if(null!=reader) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
