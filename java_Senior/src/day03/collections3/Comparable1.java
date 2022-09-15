/**
 * 泛型接口： 与继承同理
 * 重写方法随父类而定
 * @Author: Robin_Wujw
 * @Date: 2022-04-16 21:25
 */
public interface Comparable1<T> {
    void compare(T t);
}

//声明子类指定具体类型
class Comp implements Comparable1<Integer>{
    @Override
    public void compare(Integer integer) {

    }
}
//擦除
class Comp1 implements  Comparable1{
    @Override
    public void compare(Object o) {

    }
}
//父类擦除，子类泛型
class Comp2<T> implements Comparable1{
    @Override
    public void compare(Object o) {

    }
}
//子类泛型 >= 父类泛型
class Comp3<T> implements Comparable1<T>{
    @Override
    public void compare(T t) {

    }
}
//父类泛型，子类擦除 错误