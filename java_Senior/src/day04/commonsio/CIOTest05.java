import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * 大小
 * @Author: Robin_Wujw
 * @Date: 2022-04-23 16:50
 */
public class CIOTest05 {
    public static void main(String[] args) throws IOException {
        //复制文件
        //FileUtils.copyFile(new File("commonsio/emp.txt"),new File("commonsio/emp-copy.txt"));

        //复制文件到目录
        FileUtils.copyFileToDirectory(new File("commonsio/emp.txt"),
                new File("commonsio/lib"));
        FileUtils.copyDirectoryToDirectory(new File("commonsio/lib"),new File("commonsio/lib2"));
        
    }
}
