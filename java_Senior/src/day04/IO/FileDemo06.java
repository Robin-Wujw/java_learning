import java.io.File;
import java.io.IOException;

/**
 * 其他信息：
 * createNewFile():不存在才创建 存在 创建成功
 * delete():删除已经存在的文件
 * @Author: Robin_Wujw
 * @Date: 2022-04-20 15:29
 */
public class FileDemo06 {
    public static void main(String[] args) {
        File src = new File("D:/My_work/My_Code/java_learning/java_Senior/src/day04/IO/1.txt");
        boolean flag = false;
        try {
            flag = src.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(flag);
        flag = src.delete();
        System.out.println(flag);

    }
}
