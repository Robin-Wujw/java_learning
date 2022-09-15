import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.*;

import java.io.File;
import java.util.Collection;
/**
 * 大小
 * @Author: Robin_Wujw
 * @Date: 2022-04-23 16:50
 */
public class CIOTest02 {
    public static void main(String[] args) {
        Collection<File> files = FileUtils.listFiles(new File("D:/My_work/My_Code/java_learning/java_Senior"),
                EmptyFileFilter.NOT_EMPTY,null);
        for(File file : files){
            System.out.println(file.getAbsolutePath());
        }
        System.out.println("----------------------------");
        files = FileUtils.listFiles(new File("D:/My_work/My_Code/java_learning/java_Senior"),
                new SuffixFileFilter("java"), DirectoryFileFilter.INSTANCE);
        for(File file : files){
            System.out.println(file.getAbsolutePath());
        }
        System.out.println("----------------------------");
        files = FileUtils.listFiles(new File("D:/My_work/My_Code/java_learning/java_Senior"),
                FileFilterUtils.or(new SuffixFileFilter("java"),new SuffixFileFilter("class"),EmptyFileFilter.EMPTY), DirectoryFileFilter.INSTANCE);
        for(File file : files){
            System.out.println(file.getAbsolutePath());
        }
        System.out.println("----------------------------");
        files = FileUtils.listFiles(new File("D:/My_work/My_Code/java_learning/java_Senior"),
                FileFilterUtils.and(new SuffixFileFilter("java"),EmptyFileFilter.EMPTY), DirectoryFileFilter.INSTANCE);
        for(File file : files){
            System.out.println(file.getAbsolutePath());
        }
    }
}
