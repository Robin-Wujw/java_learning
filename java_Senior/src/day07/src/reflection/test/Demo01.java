package reflection.test;

/**
 * 测试各种类型(class,interface,enum,annotation,primitive type,void)java.lang.Class对象的获取方式
 * @Author: Robin_Wujw
 * @Date: 2022-06-22 21:50
 */
public class Demo01 {
    public static void main(String[] args) {
        String path = "reflection.bean.User";
        try {
            Class<?> clazz = Class.forName(path);
            //对象是表示或封装一些数据。一个类被加载后，JVM会创建一个对应该类的Class对象，
            //类的整个结构信息会放到对应的Class对象中。这个Class对象就像一面镜子一样
            //通过这面镜子我们可以看到对应类的全部信息。
            System.out.println(clazz.hashCode());

            Class<?> clazz2 = Class.forName(path);
            System.out.println(clazz2.hashCode());

            Class<?> strClazz = String.class;
            Class<?> strClazz2 = path.getClass();//这里的path 就是个string变量

            System.out.println(strClazz.hashCode());
            System.out.println(strClazz2.hashCode());
            System.out.println(strClazz==strClazz2);

            Class intClazz = int.class;

            int[] arr01 = new int[10];
            int[][] arr02 = new int[30][3];
            int[] arr03 = new int[30];
            double[] arr04 = new double[10];
            System.out.println(arr01.getClass().hashCode());
            System.out.println(arr02.getClass().hashCode());
            System.out.println(arr03.getClass().hashCode());
            System.out.println(arr04.getClass().hashCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
