package stringBuilder;

/**
 * 测试StringBuilder的一些常用方法
 * @Author: Robin_Wujw
 * @Date: 2022-04-07 15:28
 */
public class Test02 {
    public static void main(String[] args) {
        StringBuilder sb  = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        sb.delete(3,5).delete(3,5);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer();
    }
}
