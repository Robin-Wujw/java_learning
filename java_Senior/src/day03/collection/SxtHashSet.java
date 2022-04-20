import java.util.HashMap;

/**
 * 自定义自己的HashSet
 * @Author: Robin_Wujw
 * @Date: 2022-04-15 15:46
 */
public class SxtHashSet {
    HashMap map;
    private static final Object PRESENT = new Object();

    public SxtHashSet(){
        map = new HashMap();
    }
    public void add(Object o){
        map.put(o,PRESENT); //set的不可重复就是利用了map里面键对象的不可重复！

    }
    public int size(){
        return map.size();
    }
    public static void main(String[] args) {
        SxtHashSet s = new SxtHashSet();
        s.add("aaa");
        s.add(new String("aaa"));
        System.out.println(s.size());
    }
}
