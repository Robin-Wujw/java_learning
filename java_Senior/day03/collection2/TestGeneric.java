import java.util.List;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-04-15 18:56
 */
public class TestGeneric {
    public static void main(String[] args) {
        MyCollection<String> mc = new MyCollection<String>();
        mc.set("Robin",0);
        //mc.set(8888,1);

        //Integer a = (Integer)mc.get(1);
        String b = mc.get(0);

        List list;
    }
}

class MyCollection<E>{
    Object[] objs = new Object[5];

    public void set(E e,int index){
        objs[index] = e;
    }
    public E get(int index){
        return (E)objs[index];
    }
}
