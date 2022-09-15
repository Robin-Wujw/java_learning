import java.io.Closeable;
import java.io.IOException;

/**
 * 泛型方法<> 返回类型前面
 * 只能访问对象的信息，不能修改信息
 * @Author: Robin_Wujw
 * @Date: 2022-04-16 20:56
 */
public class TestMethod {
    public static void main(String[] args) {
        test("a"); // T --->String
    }
    //泛型方法
    public static <T> void test(T a){
        System.out.println(a);
    }
    //extends <=
    public static <T extends Closeable> void test(T... a ){ //...表示可变参数
        for(T temp:a){
            try {
                if(null!=temp) {
                    temp.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
