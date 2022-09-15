/**
 * 泛型没有多态

 * @Author: Robin_Wujw
 * @Date: 2022-04-17 16:46
 */
public class App01 {
    public static void main(String[] args) {
        //A<Fruit> f = new A<Apple>();
        A<Fruit> f = new A<Fruit>();
        //形参使用多态
        //public static void test(A<Fruit> f){}
        //返回类型使用多态
//        public static A<Fruit> test2(){
//            //return (A<Fruit>) (new A<Apple>());
//            return null;
//        }
    }
}
