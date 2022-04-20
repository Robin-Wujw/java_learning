import java.util.HashSet;
import java.util.Set;

/**
 * 测试HashSet的基本用法
 * Set 没有顺序不可重复
 * List 有顺序可重复
 * @Author: Robin_Wujw
 * @Date: 2022-04-15 15:39
 */
public class TestSet {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("aaa");
        set.add("vvv");
        set.add(new String("aaa")); //加不进去
        System.out.println(set.size());
        System.out.println(set.contains("aaa"));
        set.remove("aaa");
    }
}
