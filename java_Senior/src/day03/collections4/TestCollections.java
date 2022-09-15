import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Collections辅助类的使用
 * Collection是接口，Collections是工具类
 * @Author: Robin_Wujw
 * @Date: 2022-04-19 20:59
 */
public class TestCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("gao" + i);
        }
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.sort(list); // 按照递增的方式排序，自定义的类使用：Comparable接口
        System.out.println(list);

        System.out.println(Collections.binarySearch(list,"gao1"));
        //折半查找
    }
}
