import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-04-15 16:16
 */
public class Test002 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("id",0301);
        map.put("name","Robin");
        map.put("salary",3050);
        map.put("department","项目部");
        map.put("hireDate","2007-10");

        Map map2 = new HashMap();
        map2.put("id",0302);
        map2.put("name","Robin1");
        map2.put("salary",3050);
        map2.put("department","项目部");
        map2.put("hireDate","2007-10");

        Map map3 = new HashMap();
        map3.put("id",0303);
        map3.put("name","Robin2");
        map3.put("salary",3050);
        map3.put("department","项目部");
        map3.put("hireDate","2007-10");

        List<Map> list = new ArrayList<Map>();
        list.add(map);
        list.add(map2);
        list.add(map3);
        printEmpName(list);
    }
    public static void printEmpName(List<Map> list){
        for (int i = 0; i < list.size() ; i++) {
            Map tempMap = list.get(i);
            System.out.println(tempMap.get("name")+"--"+tempMap.get("salary"));
        }
    }
}
