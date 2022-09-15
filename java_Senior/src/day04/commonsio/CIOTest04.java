import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * 大小
 * @Author: Robin_Wujw
 * @Date: 2022-04-23 16:50
 */
public class CIOTest04 {
    public static void main(String[] args) throws IOException {
        //写出文件
        FileUtils.write(new File("commonsio/happy.txt"),"学习是一件伟大的事业\r\n",
                "UTF-8");
        FileUtils.writeStringToFile(new File("commonsio/happy.txt"),
                "学习是一件辛苦的事业\r\n","UTF-8",true);
        FileUtils.writeByteArrayToFile(new File("commonsio/happy.txt"),
                "学习是一件幸福的事业\r\n".getBytes(StandardCharsets.UTF_8),true);

        //写出列表
        List<String> datas = new ArrayList<>();
        datas.add("马云");
        datas.add("马化腾");
        datas.add("弼马温");

        FileUtils.writeLines(new File("commonsio/happy.txt"),datas,"。。。",true);
    }
}
