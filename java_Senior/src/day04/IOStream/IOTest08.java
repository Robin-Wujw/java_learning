import java.io.*;

/**
 * 字节数组输出流 ByteArrayOutputStream
 *  1.创建源 ： 内部维护
 *  2.选择流 ： 不关联源
 *  3.操作(写出内容)
 *  4.释放资源：可以不用
 * @Author: Robin_Wujw
 * @Date: 2022-04-20 17:04
 */
public class IOTest08 {
    public static void main(String[] args) {
        //1.创建源
        byte[] dest = null;
        //2.选择流（新增方法）
        ByteArrayOutputStream baos = null;
        try{
            baos = new ByteArrayOutputStream();
            //3.操作(写出)
            String msg = "IO is so easy";
            byte[] datas = msg.getBytes();//字符串---->字符数组(编码)
            baos.write(datas,0,datas.length);
            baos.flush();
            //获取数据
            dest = baos.toByteArray();
            System.out.println(dest.length + "--->" + new String(dest,0,baos.size()));
        }catch (IOException e) {
            e.printStackTrace();
        } finally{
            //4.释放资源
            try{
                if(null!=baos){
                    baos.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
