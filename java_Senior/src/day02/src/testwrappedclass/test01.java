package testwrappedclass;

/**
 * 测试包装类的基本用法
 * @Author: Robin_Wujw
 * @Date: 2022-04-07 18:50
 */
public class test01 {
    public static void main(String[] args) {
        Integer i = new Integer(1000 );
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.toHexString(i));
        Integer i2 = Integer.parseInt("234");
        Integer i3 = new Integer("333");
        System.out.println(i2.intValue());

        String str = 234+"";

    }
}
