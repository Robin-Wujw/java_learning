package myList;

import java.util.ArrayList;

/**
 * 模拟实现JDK中提供的ArrayList
 * @Author: Robin_Wujw
 * @Date: 2022-04-07 15:40
 */
public class MyArrayList {
    /*
    * The value is used for object storage
    * */

    private Object[] value;


    /*
    * The size is the number of objects used.
     */
    private int size;
    public int size() {
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int indexOf(Object obj){
        if(obj == null){
            return -1;
        }else{
            for (int i = 0; i < value.length ; i++) {
                if(obj==value[i]){
                    return i;
                }
            }
            return -1;
        }
    }
    public int lastIndexOf(Object obj){
        if(obj == null){
            return -1;
        }else{
            for (int i = value.length -1 ; i >= 0 ; i--) {
                if(obj==value[i]){
                    return i;
                }
            }
            return -1;
        }
    }
    public void rangeCheck(int index){
        if(index<0 || index > size-1){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public Object get(int index){
        rangeCheck(index);
        return value[index];
    }
    public Object set(int index, Object object) {
        rangeCheck(index);
        Object old = value[index];
        value[index] = object;
        return old;
    }
    public MyArrayList(){
    //    value = new Object[16];
        this(10);
    }
    public MyArrayList(int size){
        if(size<0){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        value = new Object[size];
    }
    public void add(Object obj){
        value[size] = obj;
        size++;
        if(size>=value.length){
            //装不下了 扩容
            int newCapacity = value.length * 2 + 2;
            Object[] newList = new Object[newCapacity];

            for (int i = 0; i < value.length; i++) {
                newList[i] = value[i];
            }
            value = newList;
        }
    }


    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(2);
        list.add("add");
        list.add(new Human("Robin"));
        list.add("bbbb");
        ArrayList l1;
        Human h = (Human) list.get(1);
        System.out.println(h.getName());
        System.out.println(list.get(2));
        System.out.println(list.size());
    }
}
