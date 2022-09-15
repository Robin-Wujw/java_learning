import java.io.*;

/**
 * 文件拷贝：文件字节输入、输出流
 * @Author: Robin_Wujw
 * @Date: 2022-04-20 19:39
 */
public class Copy2 {
    public static void main(String[] args) {
        copy("src/day04/IOStream/abc.txt","src/day04/IOStream/abccopy.txt");
        /*
         文件的拷贝
         思考：利用递归 制作文件夹的拷贝
         */
    }
    public static void copy(String srcPath,String destPath){
        //1.创建源
        File src = new File(srcPath);//目的地
        File dest = new File(destPath);//源头
        //2.选择流
        try(InputStream is = new FileInputStream(src);
        OutputStream os = new FileOutputStream(dest);){
            byte[] flush = new byte[1024];//缓冲容器
            int len = -1;//接收长度
            while((len=is.read(flush))!=-1) {
                os.write(flush,0,len);
            }
            os.flush();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
