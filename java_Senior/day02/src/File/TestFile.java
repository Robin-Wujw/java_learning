package File;

import java.io.File;
import java.io.IOException;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-04-08 20:24
 */
public class TestFile {
    public static void main(String[] args) {
        File f = new File("D:\\My_work\\My_Code\\java_learning\\java_Senior\\day02\\src\\File\\TestFile.java");
        File f2 = new File("D:\\My_work\\My_Code\\java_learning\\java_Senior\\day02\\src\\File");
        File f3 = new File(f2,"TestFile.java");
        File f4 = new File(f2,"TestFile666.java");
        File f5 = new File("D:\\My_work\\My_Code\\java_learning\\java_Senior\\day02\\src\\File\\AA");
        f5.mkdir(); //f5.mkdirs()创建多级目录


        try {
            f4.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            f4.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(f.isFile()){
            System.out.println("是一个文件");
        }
        if(f2.isDirectory()){
            System.out.println("是一个目录");
        }
    }
}
