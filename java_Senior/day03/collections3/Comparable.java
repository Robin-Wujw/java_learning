/**
 * 泛型接口： 与继承同理
 * @Author: Robin_Wujw
 * @Date: 2022-04-16 21:25
 */
public interface Comparable<T> {
}


//擦除
class Comp1 implements  Comparable{

}
//父类擦除，子类泛型
class Comp2<T> implements Comparable{

}
//子类泛型 >= 父类泛型
class Comp2<T> implements Comparable<T>{

}
//父类泛型，子类擦除 错误