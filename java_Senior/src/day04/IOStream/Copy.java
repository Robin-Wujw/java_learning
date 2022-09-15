import java.io.*;

/**
 * 文件拷贝：文件字节输入、输出流
 * @Author: Robin_Wujw
 * @Date: 2022-04-20 19:39
 */
public class Copy {
    public static void main(String[] args) {
        copy("src/day04/IOStream/1.png","src/day04/IOStream/1copy.png");
        /*
         文件的拷贝
         思考：利用递归 制作文件夹的拷贝
         */
    }
    public static void copy(String srcPath,String destPath){
        //1.创建源
        File dest = new File(srcPath);//目的地
        File src = new File(destPath);//源头
        //2.选择流
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);
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
        } finally{
            //4.释放资源 分别关闭 先打开的后关闭
            try{
                if(null!=os){
                    os.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
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
