import java.io.*;

/**
 * 文件字符输出流
 *  1.创建源
 *  2.选择流
 *  3.操作
 *  4.释放资源
 * @Author: Robin_Wujw
 * @Date: 2022-04-20 17:04
 */
public class IOTest06 {
    public static void main(String[] args) {
        //1.创建源
        File dest = new File("src/day04/IOStream/dest.txt");
        //2.选择流
        Writer writer = null;
        try{
            writer = new FileWriter(dest);
            //3.操作(写出)
            //写法一
//            String msg = "IO is so easy 我";
//            char[] datas = msg.toCharArray();//字符串---->字符数组(编码)
//            writer.write(datas,0,datas.length);
            //写法二
//            String msg = "IO is so easy 我";
//            writer.write(msg);
//            writer.flush();
            //写法三
            writer.append("Io\r\n").append("我");
            writer.flush();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            //4.释放资源
            try{
                if(null!=writer){
                    writer.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
