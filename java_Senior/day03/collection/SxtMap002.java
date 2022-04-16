import java.util.LinkedList;

/**
 * Map底层实现： 数组+链表
 * 自定义Map的升级版：
 * 1.提高查询的效率
 *
 * @Author: Robin_Wujw
 * @Date: 2022-04-14 18:36
 */
public class SxtMap002 {
    LinkedList[] arr = new LinkedList[999];//Map底层实现： 数组+链表
    int size;

    public void put(Object key,Object value){
        SxtEntry e = new SxtEntry(key,value);
        int hash = key.hashCode();
        hash = hash<0?-hash:hash;
        int a = key.hashCode() %arr.length;
        if(arr[a] == null){
            LinkedList list = new LinkedList();
            arr[a] = list;
            list.add(e);
        }else{
            LinkedList list = arr[a];
            for (int i = 0; i < list.size(); i++) {
                SxtEntry e2 = (SxtEntry) list.get(i);
                if(e2.key.equals(key)){
                    e2.value = value; // 键值重复直接覆盖
                    return;
                }
                }
            arr[a].add(e);
        //arr[a] = e;
        //System.out.println(key.hashCode());
    }
    }

    public Object get(Object key){
        //return arr[key.hashCode()%999];
        int a = key.hashCode() % arr.length;
        if(arr[a] != null){
            LinkedList list = arr[a];
            for (int i = 0; i < list.size(); i++) {
                SxtEntry e = (SxtEntry) list.get(i);
                if(e.key.equals(key)){
                    return e.value;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        SxtMap002 m = new SxtMap002();
        m.put("Robin",new Wife("杨幂"));
        m.put("Robin",new Wife("李四"));
        Wife w = (Wife) m.get("Robin");
        System.out.println(w.name);
    }
    }
