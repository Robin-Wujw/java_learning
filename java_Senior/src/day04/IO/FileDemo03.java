import java.io.File;

/**
 * 名称或路径
 * getName():获取名称
 * getPath()：构建是相对 返回相对 否则绝对
 * getAbsolutePath() ： 返回绝对
 * getParent()：上路径   不存在返回null
 * @Author: Robin_Wujw
 * @Date: 2022-04-20 15:06
 */
public class FileDemo03 {
    public static void main(String[] args) {
        String path = "D:/My_work/My_Code/java_learning/java_Senior/src/day04/IO/1.png";
        File src = new File(path);

        //基本信息
        System.out.println("名称"+src.getName());
        System.out.println("路径"+src.getPath());
        System.out.println("绝对路径"+src.getAbsolutePath());
        System.out.println("父路径"+src.getParent());
        System.out.println("父对象"+src.getParentFile().getName());
    }
}
