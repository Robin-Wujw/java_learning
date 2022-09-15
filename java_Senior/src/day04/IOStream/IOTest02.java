import java.io.*;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-04-20 16:39
 */
public class IOTest02 {
    public static void main(String[] args) {
        //1.创建源
        File src = new File("src/day04/IOStream/abc.txt");
        //2.选择流
        InputStream is = null;
        try {
            is = new FileInputStream(src);
            //3.操作(读取)
            int temp;
            while((temp=is.read())!=-1) {
                System.out.println((char)temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.释放资源
            try {
                if(null!=is) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
