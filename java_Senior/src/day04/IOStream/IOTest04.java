import java.io.*;

/**
 * 文件字节输出流
 *  1.创建源
 *  2.选择流
 *  3.操作
 *  4.释放资源
 * @Author: Robin_Wujw
 * @Date: 2022-04-20 17:04
 */
public class IOTest04 {
    public static void main(String[] args) {
        //1.创建源
        File dest = new File("IOTest04");
        //2.选择流
        OutputStream os = null;
        try{
            os = new FileOutputStream(dest,true);
            //3.操作(写出)
            String msg = "IO is so easy";
            byte[] datas = msg.getBytes();//字符串---->字符数组(编码)
            try {
                os.write(datas,0,datas.length);
                os.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally{
            //4.释放资源
            try{
                if(null!=os){
                    os.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
