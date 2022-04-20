/**
 * 多态的两种形式
 * @Author: Robin_Wujw
 * @Date: 2022-04-17 16:43
 */
public class FruitApp {
    public static void main(String[] args) {
        Fruit f = new Apple();
    }
    //形参使用多态
    public static void test(Fruit f){}
    //返回类型使用多态
    public static Fruit test2(){
        return new Apple();
    }
}
