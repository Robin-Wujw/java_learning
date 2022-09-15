import java.io.*;

/**
 * 1.封装拷贝
 * 2.封装释放
 * @Author: Robin_Wujw
 * @Date: 2022-04-21 17:56
 */
public class FileUtils1 {
    public static void main(String[] args) {
        //文件到文件
        try {
            InputStream is = new FileInputStream("src/day04/IOStream/abc.txt");
            OutputStream os = new FileOutputStream("src/day04/IOStream/abccopy.txt");
            copy(is,os);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] datas = null;
    //文件到字节数组
        try {
            InputStream is = new FileInputStream("src/day04/IOStream/1.png");
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            copy(is,os);
            datas = os.toByteArray();
            System.out.println(datas.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    //字节数组到文件
        try {
            InputStream is = new ByteArrayInputStream(datas);
            OutputStream os = new FileOutputStream("p_copy.png");
            copy(is,os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    对接输入输出流
     */
    public static void copy(InputStream is,OutputStream os){
        try{
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
            close(is,os);
        }
    }
/*
 * 释放资源
 **/
public static void close(InputStream is,OutputStream os){
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
    /*
     * 释放资源
     **/
public static void close(Closeable... ios){
    for(Closeable io:ios){
        try {
            if(null!=io) {
                io.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
}
