import java.io.File;

/**
 * 其他信息
 * length(): 字节数
 * @Author: Robin_Wujw
 * @Date: 2022-04-20 15:26
 */
public class FileDemo05 {
    public static void main(String[] args) {
        File src = new File("D:/My_work/My_Code/java_learning/java_Senior/src/day04/IO/1.png");
        System.out.println("长度："+src.length());

        src = new File("D:/My_work/My_Code/java_learning/java_Senior/src/day04/IO");
        System.out.println("长度："+src.length());

        src = new File("D:/My_work/My_Code/java_learning/java_Senior/src/day04/IO1");
        System.out.println("长度："+src.length());
    }
}
