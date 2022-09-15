import java.io.File;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-04-20 14:50
 */
public class FileDemo01 {
    public static void main(String[] args) {
        String path = "D:/My_work/My_Code/java_learning/java_Senior/src/day04/IO/1.png";;
        //1.构建File对象
        File src = new File(path);
        System.out.println(src.length());

        //2.构建File对象
        src = new File("D:/My_work/My_Code/java_learning/java_Senior/src/day04/IO","1.png");
        System.out.println(src.length());

        //3.构建File对象
        src = new File(new File("D:/My_work/My_Code/java_learning/java_Senior/src/day04/IO"),"1.png");
        System.out.println(src.length());
    }
}
