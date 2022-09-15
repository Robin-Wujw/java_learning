import java.io.File;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-04-20 14:45
 */
public class PathDemo01 {
    /*
     \ / 名称分隔符 separator
     */
    public static void main(String[] args) {
        String path = "D:\\My_work\\My_Code\\java_learning\\java_Senior\\src\\day04\\IO\\1.png";
        System.out.println(File.separatorChar);

        //建议
        //1. /
        path =  "D:/My_work/My_Code/java_learning/java_Senior/src/day04/IO/1.png";
        //2. 常量拼接
        String path1 = "D:" + File.separator + "java300" + File.separator+"IO.png";
        System.out.println(path);
        System.out.println(path1);
    }
}
