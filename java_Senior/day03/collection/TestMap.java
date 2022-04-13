import java.util.HashMap;
import java.util.Map;

/**
 * 测试Map的基本用法
 * @Author: Robin_Wujw
 * @Date: 2022-04-13 22:22
 */
public class TestMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("Robin",new Wife("xxx"));
        map.put("张三",new Wife("杨幂"));

//        map.remove("Robin");
        Wife w = (Wife) map.get("Robin");
        System.out.println(map.containsKey("张三"));
        System.out.println(w.name);
    }
}

class Wife{
    String name;
    public Wife(String name){
        this.name = name;
    }
}