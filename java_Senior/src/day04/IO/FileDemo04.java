import java.io.File;

/**
 * 文件状态
 * 1.不存在：exists
 * 2.存在
 *   文件：isFile
 *   文件夹：isDirectory
 * @Author: Robin_Wujw
 * @Date: 2022-04-20 15:12
 */
public class FileDemo04 {
    public static void main(String[] args) {
        File src = new File("D:/My_work/My_Code/java_learning/java_Senior/src/day04/IO/1.png");
        System.out.println("是否存在："+src.exists());
        System.out.println("是否文件："+src.isFile());
        System.out.println("是否文件夹："+src.isDirectory());

        System.out.println("------------------------");
        //相对路径
        System.out.println(System.getProperty("user.dir"));
        src = new File("src/day04/IO/1.png");
        System.out.println("路径："+src.getPath());
        System.out.println("是否存在："+src.exists());
        System.out.println("是否文件："+src.isFile());
        System.out.println("是否文件夹："+src.isDirectory());
    }
}
