import java.io.Closeable;
import java.io.IOException;

/**
 * 工具类
 * @Author: Robin_Wujw
 * @Date: 2022-05-15 16:01
 */
public class SxtUtils {
    /*
     释放资源
     */
    public static void close(Closeable... targets){
        for(Closeable target:targets){
            try{
                if(null!=target){
                    target.close();

                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
