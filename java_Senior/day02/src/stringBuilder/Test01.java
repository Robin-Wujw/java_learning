package stringBuilder;

/**
 * String: 不可变字符序列
 * 测试可变字符序列。 StringBuilder(线程不安全，效率高)，StringBuffer(线程安全，效率低)
 * @Author: Robin_Wujw
 * @Date: 2022-04-07 13:59
 */
public class Test01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); //字符数组长度初始为16
        StringBuilder sb1 = new StringBuilder(32); //字符数组长度初始为32
        StringBuilder sb2 = new StringBuilder("abcd"); //字符数组长度初始为 4+16
        sb2.append("efg");
        sb2.append(true).append(321).append("随便"); //通过return this 实现方法链
        System.out.println(sb2);

        System.out.println("***************************");
        StringBuilder gh = new StringBuilder("a");
        for (int i = 0; i < 10; i++) {
            gh.append(i);
        }
    }
}
