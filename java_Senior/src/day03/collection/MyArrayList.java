

/**
 * 自己实现一个ArrayList 帮助我们更好的理解ArrayList类的底层结构
 * @Author: Robin_Wujw
 * @Date: 2022-04-13 16:34
 */
public class MyArrayList<pirvate> {
    private Object[] elementData;

    private int size;
    public MyArrayList(){
        this(10);
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public MyArrayList(int initialCapacity){
        if(initialCapacity < 0){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        elementData = new Object[initialCapacity];
    }
    public void add(Object obj){
        //数组扩容
        if(size == elementData.length){
            Object[] newArray = new Object[size*2+1];
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData = newArray;
        }
        elementData[size++ ] = obj;
    }
    private void rangeCheck(int index){
        if(index<0 || index >=size){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public Object get(int index){
        rangeCheck(index);
        return elementData[index];
    }
    public void remove(int index){
        //删除指定位置的对象
        //a b c d e
        rangeCheck(index);
        int numMoved = size - index - 1;
        if(numMoved >0 ){
            System.arraycopy(elementData,index+1,elementData,index,numMoved);
        }
        elementData[--size] = null;
    }
    public void remove (Object obj){
        for (int i = 0; i < size ; i++) {
            if(get(i).equals(obj)){ //注意：底层调用equals方法不是==
                remove(i);
            }
        }
    }
    public Object set(int index,Object obj){
        rangeCheck(index);
        Object oldValue = elementData[index];
        elementData[index] = obj;
        return oldValue;
    }
    public void add(int index,Object obj){
        rangeCheck(index);
        ensureCapacity();//扩容
        System.arraycopy(elementData,index,elementData,index+1,size-index);
        elementData[index] = obj;
        size++;
    }
    private void ensureCapacity(){
        if(size == elementData.length){
            Object[] newArray = new Object[size*2+1];
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData = newArray;
        }
    }
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(3);
        list.add("333");
        list.add("334");
        list.add("335");
        list.add("336");
        list.add("337");
        System.out.println(list.size());
        System.out.println(list.get(3));
    }
}
