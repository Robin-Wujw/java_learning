/**
 * 没有泛型数组
 * 声明可以使用，但是创建失败
 * @Author: Robin_Wujw
 * @Date: 2022-04-18 19:28
 */
public class Array {
    public static void main(String[] args) {
        Integer[] arr = new Integer[4];
        //Student04<String>[] arr2 = new Student04<String>[10];
        //Student04<?>[] arr2 = new Student04[10]; //可以但是没啥意义

        MyArrayList01<String> strList = new MyArrayList01<String>();
        strList.add(0,"a");
        String elem = strList.getElem(0);
        System.out.println(elem);
    }
}

class MyArrayList01<E>{
    Object[] cap = new Object[10];

    public void add(int idx,E e){
        cap[idx] = e;
    }

    public E[] getAll(){
        return (E[]) cap;
    }
    public E getElem(int idx){
        return (E) cap[idx];
    }
}