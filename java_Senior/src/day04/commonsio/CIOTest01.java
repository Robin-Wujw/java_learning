import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * 大小
 * @Author: Robin_Wujw
 * @Date: 2022-04-23 16:50
 */
public class CIOTest01 {
    public static void main(String[] args) {
        //文件大小
        //System.out.println(System.getProperty("user.dir"));
        long len = FileUtils.sizeOf(new File("commonsio/CIOTest01.java"));
        System.out.println(len);
        //目录大小
        len = FileUtils.sizeOf(new File("D:/My_work/My_Code/java_learning/java_Senior"));
        System.out.println(len);
    }
}
