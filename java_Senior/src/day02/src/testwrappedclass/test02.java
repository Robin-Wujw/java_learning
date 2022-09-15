package testwrappedclass;

/**
 * 测试自动装箱和拆箱
 * @Author: Robin_Wujw
 * @Date: 2022-04-07 19:36
 */
public class test02 {
    public static void main(String[] args) {
        //Integer a = new Integer(1000);
        Integer a = 1000; //jdk5.0以后  自动装箱，编译器帮我们改进代码： Integer a = new Integer(1000);
        Integer b = 2000;
        int c = 1500;//编译器改进 new Integer(1500).intValue();
        int e = b; // 自动拆箱，编译器改进：b.intValue();
        System.out.println(e);

        Integer d = 1234;
        Integer d2 = 1234;
        System.out.println(d == d2);
        System.out.println(d.equals(d2));
        Integer d3 = 123; //[-128,127]之间的数，仍然当作基本数据类型来处理
        Integer d4 = 123;
        System.out.println(d3==d4);
        System.out.println(d3.equals(d4));
    }
}
