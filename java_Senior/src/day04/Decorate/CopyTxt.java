import java.io.*;

/**
 * 文件拷贝：文件字节输入、输出流
 * @Author: Robin_Wujw
 * @Date: 2022-04-20 19:39
 */
public class CopyTxt {
    public static void main(String[] args) {
        copy("src/day04/Decorate/abc.txt","src/day04/Decorate/abc-copy.txt");
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
        try(BufferedReader br = new BufferedReader(new FileReader(src));
        BufferedWriter bw = new BufferedWriter(new FileWriter(dest));){
        String line = null;
        while((line = br.readLine())!=null) {
            bw.write(line);
            bw.newLine();
        }
            bw.flush();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
