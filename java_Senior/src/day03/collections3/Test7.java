import java.util.ArrayList;
import java.util.List;

/**
 * 1.7中使用泛型,声明一次类型即可
 * 在使用|创建时不指定类型
 * @Author: Robin_Wujw
 * @Date: 2022-04-18 19:37
 */
public class Test7 {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<String>();
        List<String> arrList1 = new ArrayList<>();
    }
}
