import java.util.*;
import java.util.Map.Entry;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-04-15 16:38
 */
public class iterator {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("aaa");
        list.add("aab");
        list.add("aac");
        //通过索引遍历List
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        //通过迭代器遍历List
        for(Iterator iter2 = list.iterator(); iter2.hasNext();){
            String str = (String) iter2.next();
            System.out.println(str);
            iter2.remove();
        }
        Set set = new HashSet();
        set.add("高1");
        set.add("高2");
        set.add("高3");
        //Iterator iter = set.iterator();
        //while(iter.hasNext()){
        //遍历set
        for(Iterator iter = set.iterator();iter.hasNext();){
            String str = (String) iter.next();
            System.out.println(str);
        }

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(100,"aa");
        map1.put(200,"bb");
        map1.put(300,"cc");
        //遍历Map 方式1
        Set<Entry<Integer,String>> ss = map1.entrySet();
        for(Iterator<Entry<Integer,String>> iter=ss.iterator();iter.hasNext();){
            Entry<Integer,String> temp = iter.next();
            System.out.println(temp.getKey()+"--" + temp.getValue());
        }
        //遍历Map 方式2
        Set<Integer> keySet = map1.keySet();
        for(Iterator<Integer> iter = keySet.iterator();iter.hasNext();){
            Integer key = iter.next();
            System.out.println(key + "-----" + map1.get(key));
        }
    }
}
