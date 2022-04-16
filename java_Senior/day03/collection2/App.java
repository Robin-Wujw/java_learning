/**
 * 获取值：
 * 1.强制类型转换
 * 2.手动类型检查：可能转换错误
 * @Author: Robin_Wujw
 * @Date: 2022-04-16 20:34
 */
public class App {
    public static void main(String[] args) {
        //存入整数 int --> Integer -->
        Student01 stu = new Student01(80,90);
        int javaseScore = (Integer) stu.getJavase();
        String oracleScore = null;
        if(stu.getOracle() instanceof String) {
            oracleScore = (String) stu.getOracle();
        }
        System.out.println("分数为：" + javaseScore + "," + oracleScore);
    }
}
