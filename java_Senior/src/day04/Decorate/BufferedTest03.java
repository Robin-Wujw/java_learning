import java.io.*;

/**
 * 分段读取 文件字符输入流
 * @Author: Robin_Wujw
 * @Date: 2022-04-21 16:11
 */
public class BufferedTest03 {
    public static void main(String[] args) {
        //1.创建源
        File src = new File("src/day04/IOStream/dest.txt");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(src));
            //3.操作(分段读取)
            String line = null;
            while((line=reader.readLine())!=null) {
                //字符数组 ---->字符串(解码)
                System.out.println(line);
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
