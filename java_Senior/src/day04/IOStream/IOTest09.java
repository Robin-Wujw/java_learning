import java.io.*;

/**
    1.图片读取到字节数组中
    2.字节数组写出到文件
 * @Author: Robin_Wujw
 * @Date: 2022-04-20 17:04
 */
public class IOTest09 {
    public static void main(String[] args) {
        String filePath = "src/day04/IOStream/1.png";
        byte[] datas = fileToByteArray(filePath);
        System.out.println(datas.length);
        byteArrayToFile(datas,"src/day04/IOStream/p-byte.png");
    }
    /*
        1.图片读取到字节数组中
        1)图片到程序 FileInputStream
        2)程序到字节数组 ByteArrayOutputStream
    */
    public static byte[] fileToByteArray(String filePath){
        //1.创建源
        File src = new File(filePath);
        byte[] dest = null;
        //2.选择流
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            is = new FileInputStream(src);
            baos = new ByteArrayOutputStream();
            //3.操作(分段读取)
            byte[] flush = new byte[1024 * 10];//缓冲容器
            int len = -1;//接收长度
            while((len=is.read(flush))!=-1) {
                baos.write(flush,0,len);//写出到字符数组中
            }
            baos.flush();
            return baos.toByteArray();
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
        return null;
    }

    /*
        2.字节数组写出到文件
        1)字节数组到程序 ByteArrayInputStream
        2)程序到文件 FileOutputStream
    */
    public static void byteArrayToFile(byte[] src,String filePath){
        //1.创建源
        File dest = new File(filePath);
        //2.选择流
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new ByteArrayInputStream(src);
            os = new FileOutputStream(dest);
            //3.操作(写出)
            byte[] flush = new byte[5];//缓冲容器
            int len = -1;//接收长度
            while((len=is.read(flush))!=-1) {
                os.write(flush,0,len);
            }
            os.flush();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null!=os){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
