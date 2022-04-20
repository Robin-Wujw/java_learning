import java.io.File;

/**
 * 构建File对象
 * 相对路径与绝对路径
 * 1.存在盘符：绝对路径
 * 2.不存在盘符：相对路径
 * @Author: Robin_Wujw
 * @Date: 2022-04-20 14:55
 */
public class FileDemo02 {
    public static void main(String[] args) {
        String path = "D:/My_work/My_Code/java_learning/java_Senior/src/day04/IO/1.png";

        //绝对路径
        File src = new File(path);
        System.out.println(src.getAbsolutePath());
        //相对路径
        System.out.println(System.getProperty("user.dir"));
        src = new File("IO.png");
        System.out.println(src.getAbsolutePath());

        //构建一个不存在的文件
        src = new File("aaa/IO2.png");
        System.out.println(src.getAbsolutePath());
    }
}
