import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-04-14 20:15
 */
public class TestEquals {
    public static void main(String[] args) {
        List list = new ArrayList();
//        String s1 = new String("aaa");
//        String s2 = new String("aaa");
        Integer s1 = new Integer(243);
        Integer s2 = new Integer(243);
        list.add(s1);
        list.add(s2);
        System.out.println(list.size());

        Map map = new HashMap();
        //键不能重复
        map.put(s1,"AAAA");
        map.put(s2,"BBBBBB");
        System.out.println(map.get("aaa"));
    }
}
