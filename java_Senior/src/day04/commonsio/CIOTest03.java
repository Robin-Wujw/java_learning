import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * 大小
 * @Author: Robin_Wujw
 * @Date: 2022-04-23 16:50
 */
public class CIOTest03 {
    public static void main(String[] args) throws IOException {
        //读取文件
        String msg = FileUtils.readFileToString(new File("commonsio/emp.txt"),"UTF-8");
        System.out.println(msg);
        byte[] datas = FileUtils.readFileToByteArray(new File("commonsio/emp.txt"));
        System.out.println(datas.length);

        //逐行读取
        List<String> msgs = FileUtils.readLines(new File("commonsio/emp.txt"),"UTF-8");
        for(String string:msgs){
            System.out.println(string);
        }
        LineIterator it = FileUtils.lineIterator(new File("commonsio/emp.txt"));
        while(it.hasNext()){
            System.out.println(it.nextLine());
        }
    }
}
